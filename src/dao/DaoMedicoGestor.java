/*
 * Clase Dao de Medico, encargada de obtener, guardar, editar y 
 * eliminar Expedientes localmente y en la base de datos.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Antecedentes;
import modelos.DataPaciente;

/**
 *
 * @author Martin Majewsky
 */
public class DaoMedicoGestor{
    
    private Connection conn ;
    private final Conexion conexion = new Conexion();
    private PreparedStatement verPacientes;
    private PreparedStatement insertarPaciente;
    private PreparedStatement editarPaciente;
    private PreparedStatement eliminarPaciente;
    private PreparedStatement verDataMedico;
    private ArrayList<DataPaciente> listaDataPaciente = new ArrayList();
    private ArrayList<Antecedentes> listaAntPaciente = new ArrayList();
    private ArrayList<String> mostrarDatosMedico;
    
    //Constructor
    public DaoMedicoGestor() {
        try {
            conn = conexion.obtenerConexion();
            verPacientes = conn.prepareStatement("Select * from ExpedientePaciente");
            
            insertarPaciente = conn.prepareStatement("Insert Into ExpedientePaciente"
                    + "(id, nombre, apellido, direccion, edad, "
                    + "escolaridad, fechaNac, grupoEtnico, nombreMadre, "
                    + "nombrePadre, oficio, sexo, alimentacion, consumo, "
                    + "horasActFisica, horasLaborales, inmunizacion, "
                    + "cirugias, enfCronicas, enfInfectoCont, "
                    + "hospitalizaciones, enfContag, enfHereditaria) "
                    + "Values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?)"); 
            
            editarPaciente = conn.prepareStatement("Update ExpedientePaciente "
                    + "set nombre = ?, apellido = ?, direccion = ?,  edad = ?, "
                    + "escolaridad = ?, fechaNac = ?,  grupoEtnico = ?, "
                    + "nombreMadre = ?, nombrePadre  = ?, oficio = ?, sexo = ?,  "
                    + "alimentacion = ?, consumo = ?, horasActFisica = ?, "
                    + "horasLaborales = ?, inmunizacion = ?, cirugias = ?, "
                    + "enfCronicas = ?, enfInfectoCont = ?, hospitalizaciones = ?, "
                    + "enfContag = ?, enfHereditaria = ? where id = ?");
            
            eliminarPaciente = conn.prepareStatement("Delete "
                    + "From ExpedientePaciente where id = ?");
            
            verDataMedico = conn.prepareStatement("Select * from MedicoLogin");
        } catch (SQLException ex) {
            Logger.getLogger(DaoMedicoGestor.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaDataPaciente = this.listarRegistrosData();
        listaAntPaciente = this.listarRegistrosAnt();
        mostrarDatosMedico = this.mostrarRegistroMedico();
    }
    
    public ArrayList<DataPaciente> getListaDataPaciente(){
        return listaDataPaciente;
    }
    
    public ArrayList<Antecedentes> getListaAntPaciente(){
        return listaAntPaciente;
    }
    
    public ArrayList<String> getMostrarDatosMedico(){
        return mostrarDatosMedico;
    }
    
    /**
     * Agrega un nuevo expediente
     * @param apellidos Apellido
     * @param id Id 
     * @param nombres Nombre
     * @param direccion Direccion
     * @param edad Edad
     * @param escolaridad Escolaridad
     * @param fechaNac Fecha de Nacimiento
     * @param grupoEtnico Grupo Etnico
     * @param nombreMadre Nombre de la Madre
     * @param nombrePadre Nombre del Padre
     * @param oficio Oficio
     * @param sexo Sexo
     * @param alimentacion Tipo de Alimentacion
     * @param consumo Consumo de drogas o farmacos
     * @param horasActFisica Horas de Actividad fisica diaria
     * @param horasLaborales Horas laborales diarias
     * @param inmunizacion Inmunizacion
     * @param cirugias Cirugias
     * @param enfCronicas Enfermedades Cronicas
     * @param enfInfectoCont Enfermedades Infectocontagiosas
     * @param hospitalizaciones Hospitalizaciones
     * @param enfContag Enfermedades Contagiosas
     * @param enfHereditaria Enfermedades Hereditarias
     * @return Entero para determinar si se guardaron los datos.
     */
    public int agregarPaciente(String apellidos, String id, String nombres, 
            String direccion, int edad, String escolaridad, String fechaNac, 
            String grupoEtnico, String nombreMadre, String nombrePadre, 
            String oficio, String sexo, String alimentacion, String consumo, 
            int horasActFisica, int horasLaborales, boolean inmunizacion, 
            String cirugias, String enfCronicas, String enfInfectoCont, 
            String hospitalizaciones, String enfContag, String enfHereditaria){
        int b = 0;
        try{
            listaDataPaciente.add(new DataPaciente(
                    apellidos, id, nombres, 4, 
                    direccion, edad, escolaridad, fechaNac, grupoEtnico, 
                    nombreMadre, nombrePadre, oficio, sexo
            ));
            listaAntPaciente.add(new Antecedentes(
                    id, alimentacion, consumo, horasActFisica, horasLaborales, 
                    inmunizacion, cirugias, enfCronicas, enfInfectoCont, 
                    hospitalizaciones, enfContag, enfHereditaria
            ));
            b = 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    /**
     * Edita un expediente ya guardado
     * @param apellidos Apellido
     * @param id Id 
     * @param nombres Nombre
     * @param direccion Direccion
     * @param edad Edad
     * @param escolaridad Escolaridad
     * @param fechaNac Fecha de Nacimiento
     * @param grupoEtnico Grupo Etnico
     * @param nombreMadre Nombre de la Madre
     * @param nombrePadre Nombre del Padre
     * @param oficio Oficio
     * @param sexo Sexo
     * @param alimentacion Tipo de Alimentacion
     * @param consumo Consumo de drogas o farmacos
     * @param horasActFisica Horas de Actividad fisica diaria
     * @param horasLaborales Horas laborales diarias
     * @param inmunizacion Inmunizacion
     * @param cirugias Cirugias
     * @param enfCronicas Enfermedades Cronicas
     * @param enfInfectoCont Enfermedades Infectocontagiosas
     * @param hospitalizaciones Hospitalizaciones
     * @param enfContag Enfermedades Contagiosas
     * @param enfHereditaria Enfermedades Hereditarias
     * @return Entero para determinar si se guardaron los datos.
     */
    public int editarPaciente(String apellidos, String id, String nombres, 
            String direccion, int edad, String escolaridad, String fechaNac, 
            String grupoEtnico, String nombreMadre, String nombrePadre, 
            String oficio, String sexo, String alimentacion, String consumo, 
            int horasActFisica, int horasLaborales, boolean inmunizacion, 
            String cirugias, String enfCronicas, String enfInfectoCont, 
            String hospitalizaciones, String enfContag, String enfHereditaria){
        int b = 0;
        try{          
            for(DataPaciente p : listaDataPaciente){   
                if(p.getId().equals(id)){
                    p.setApellidos(apellidos);
                    p.setNombres(nombres);
                    p.setEstado(2);
                    p.setDireccion(direccion);
                    p.setEdad(edad);
                    p.setEscolaridad(escolaridad);
                    p.setFechaNac(fechaNac);
                    p.setGrupoEtnico(grupoEtnico);
                    p.setNombreMadre(nombreMadre);
                    p.setNombrePadre(nombrePadre);
                    p.setOficio(oficio);
                    p.setSexo(sexo);
                    break;
                }
            }
            for(Antecedentes p : listaAntPaciente){   
                if(p.getIdP().equals(id)){
                    p.setAlimentacion(apellidos);
                    p.setConsumo(consumo);
                    p.setHorasActFisica(horasActFisica);
                    p.setHorasLaborales(horasLaborales);
                    p.setInmunizacion(inmunizacion);
                    p.setCirugias(cirugias);
                    p.setEnfCronicas(enfCronicas);
                    p.setEnfInfectoCont(enfInfectoCont);
                    p.setHospitalizaciones(hospitalizaciones);
                    p.setEnfContag(enfContag);
                    p.setEnfHereditaria(enfHereditaria);
                    return 1;
                }
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    /**
     * Elimina un expediente
     * @param id Id
     * @return Entero para determinar si se eliminaron los datos.
     */
    public int eliminarPaciente(String id){
        int b = 0;
        try{
            for(DataPaciente p : listaDataPaciente){
                if(p.getId().equals(id)){
                    p.setEstado(3);
                    return 1;
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    /**
     * Busca a un expediente en especifico
     * @param id Id
     * @return Datos obtenidos del expediente encontrado 
     */
    public String[] buscarPaciente(String id){
        String[] datosPaciente = new String[23];
        try{
            for(DataPaciente p : listaDataPaciente){
                if(p.getId().equals(id)){
                    datosPaciente[0] = p.getId();
                    datosPaciente[1] = p.getNombres();
                    datosPaciente[2] = p.getApellidos();
                    datosPaciente[3] = p.getDireccion();
                    datosPaciente[4] = ""+p.getEdad();
                    datosPaciente[5] = p.getEscolaridad();
                    datosPaciente[6] = p.getFechaNac();
                    datosPaciente[7] = p.getGrupoEtnico();
                    datosPaciente[8] = p.getNombreMadre();
                    datosPaciente[9] = p.getNombrePadre();
                    datosPaciente[10] = p.getOficio();
                    datosPaciente[11] = p.getSexo();
                }
            }
            for(Antecedentes p : listaAntPaciente){
                if(p.getIdP().equals(id)){
                    datosPaciente[12] = p.getAlimentacion();
                    datosPaciente[13] = p.getConsumo();
                    datosPaciente[14] = ""+p.getHorasActFisica();
                    datosPaciente[15] = ""+p.getHorasLaborales();
                    datosPaciente[16] = ""+p.isInmunizacion();
                    datosPaciente[17] = p.getCirugias();
                    datosPaciente[18] = p.getEnfCronicas();
                    datosPaciente[19] = p.getEnfInfectoCont();
                    datosPaciente[20] = p.getHospitalizaciones();
                    datosPaciente[21] = p.getEnfContag();
                    datosPaciente[22] = p.getEnfHereditaria();
                }
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return datosPaciente;
    }
    
    public ArrayList<DataPaciente> listarRegistrosData(){
        ArrayList<DataPaciente> listado = null;
        ResultSet rs = null;
        try{
            rs = verPacientes.executeQuery();
            listado =  new ArrayList();
            while(rs.next()){
                listado.add(new DataPaciente(
                        rs.getString("apellido"),
                        rs.getString("id"),
                        rs.getString("nombre"),
                        1,
                        rs.getString("direccion"),
                        rs.getInt("edad"),
                        rs.getString("escolaridad"),
                        rs.getString("fechaNac"),
                        rs.getString("grupoEtnico"),
                        rs.getString("nombreMadre"),
                        rs.getString("nombrePadre"),
                        rs.getString("oficio"),
                        rs.getString("sexo")
                ));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{ 
            try{
                rs.close();
            }catch(SQLException ex){
                conexion.close(conn);
            }
        }
        return listado;
    }
    
    public ArrayList<Antecedentes> listarRegistrosAnt(){
        ArrayList<Antecedentes> listado = null;
        ResultSet rs = null;
        try{
            rs = verPacientes.executeQuery();
            listado =  new ArrayList();
            while(rs.next()){
                listado.add(new Antecedentes(
                        rs.getString("id"),
                        rs.getString("alimentacion"),
                        rs.getString("consumo"),
                        rs.getInt("horasActFisica"),
                        rs.getInt("horasLaborales"),
                        rs.getBoolean("inmunizacion"),
                        rs.getString("cirugias"),
                        rs.getString("enfCronicas"),
                        rs.getString("enfInfectoCont"),
                        rs.getString("hospitalizaciones"),
                        rs.getString("enfContag"),
                        rs.getString("enfHereditaria")
                ));
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{ 
            try{
                rs.close();
            }catch(SQLException ex){
                conexion.close(conn);
            }
        }
        return listado;
    }
    
    public ArrayList<String> mostrarRegistroMedico(){
        ArrayList<String> datos = new ArrayList();
        ResultSet rs = null;
        try{
            rs = verDataMedico.executeQuery();
            while(rs.next()){
                datos.add(rs.getString("nombre"));
                datos.add(rs.getString("apellido"));
                datos.add(rs.getString("especialidad"));
                datos.add(rs.getString("usuario"));
                datos.add(rs.getString("pw"));
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{ 
            try{
                rs.close();
            }catch(SQLException ex){
                conexion.close(conn);
            }
        }
        return datos;
    }
    
    public DefaultTableModel getTablaPacientes(){
        DefaultTableModel tbl = new DefaultTableModel();
        try{
            String titulo[] = {"ID", "Nombre(s)", "Apellido(s)"};
            tbl.setColumnIdentifiers(titulo);
            for(DataPaciente p : listaDataPaciente){
                Object[] datos = new Object[3];
                datos[0] = p.getId();
                datos[1] = p.getNombres();
                datos[2] = p.getApellidos();
                tbl.addRow(datos);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return tbl;
    }
    
    //Agrega un Registro a la Base de Datos
    public int agregarRegistroBD(DataPaciente p){
        int r = 0;
        try{
            insertarPaciente.setString(1, p.getId());
            insertarPaciente.setString(2, p.getNombres());
            insertarPaciente.setString(3, p.getApellidos());
            insertarPaciente.setString(4, p.getDireccion());
            insertarPaciente.setString(5, ""+p.getEdad());
            insertarPaciente.setString(6, p.getEscolaridad());
            insertarPaciente.setString(7, p.getFechaNac());
            insertarPaciente.setString(8, p.getGrupoEtnico());
            insertarPaciente.setString(9, p.getNombreMadre());
            insertarPaciente.setString(10, p.getNombrePadre());
            insertarPaciente.setString(11, p.getOficio());
            insertarPaciente.setString(12, p.getSexo());
            insertarPaciente.setString(13, p.getAlimentacion());
            insertarPaciente.setString(14, p.getConsumo());
            insertarPaciente.setInt(15, p.getHorasActFisica());
            insertarPaciente.setInt(16, p.getHorasLaborales());
            insertarPaciente.setBoolean(17, p.isInmunizacion());
            insertarPaciente.setString(18, p.getCirugias());
            insertarPaciente.setString(19, p.getEnfCronicas());
            insertarPaciente.setString(20, p.getEnfInfectoCont());
            insertarPaciente.setString(21, p.getHospitalizaciones());
            insertarPaciente.setString(22, p.getEnfContag());
            insertarPaciente.setString(23, p.getEnfHereditaria());
            r = insertarPaciente.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al guardar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;
    }
    
    //Modifica un Registro a la Base de Datos
    public int modificaRegistroBD(DataPaciente p){
        int r = 0;
        try{
            editarPaciente.setString(1, p.getNombres());
            editarPaciente.setString(2, p.getApellidos());
            editarPaciente.setString(3, p.getDireccion());
            editarPaciente.setString(4, ""+p.getEdad());
            editarPaciente.setString(5, p.getEscolaridad());
            editarPaciente.setString(6, p.getFechaNac());
            editarPaciente.setString(7, p.getGrupoEtnico());
            editarPaciente.setString(8, p.getNombreMadre());
            editarPaciente.setString(9, p.getNombrePadre());
            editarPaciente.setString(10, p.getOficio());
            editarPaciente.setString(11, p.getSexo());
            editarPaciente.setString(12, p.getAlimentacion());
            editarPaciente.setString(13, p.getConsumo());
            editarPaciente.setInt(14, p.getHorasActFisica());
            editarPaciente.setInt(15, p.getHorasLaborales());
            editarPaciente.setBoolean(16, p.isInmunizacion());
            editarPaciente.setString(17, p.getCirugias());
            editarPaciente.setString(18, p.getEnfCronicas());
            editarPaciente.setString(19, p.getEnfInfectoCont());
            editarPaciente.setString(20, p.getHospitalizaciones());
            editarPaciente.setString(21, p.getEnfContag());
            editarPaciente.setString(22, p.getEnfHereditaria());
            editarPaciente.setString(23, p.getId());
            r = editarPaciente.executeUpdate();
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al modificar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;
                
    }
    
    //Elimina un Registro a la Base de Datos
    public int eliminarRegistroBD(DataPaciente p){
        int r = 0;
        try{
            eliminarPaciente.setString(1, p.getId());
            r = eliminarPaciente.executeUpdate();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al eliminar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;
                
    }
    
    //Actualiza a la Base de Datos
    public String actualizarBD(){
        String msn ="";
        String msnError = "Errores en:";
        int nuevo = 0, modificado = 0, eliminados = 0;
        int errorN = 0, errorM = 0, errorE = 0;
        
        for (DataPaciente p : listaDataPaciente){
            switch(p.getEstado()){
                case 1: 
                    break;
                case 2:
                    if(this.modificaRegistroBD(p) != 0) modificado ++;
                    else{
                        errorM ++;
                        msnError += "- Error al modifcar el expediente de: " 
                                + p.getNombres()+" "+p.getApellidos()+"\n";
                    }
                    break;
                case 3:
                    if(this.eliminarRegistroBD(p)!= 0) eliminados ++;
                    else{
                        errorE++;
                        msnError += "- Error al eliminar el expediente de: "
                                + p.getNombres()+" "+p.getApellidos()+"\n";
                    }
                    break;
                case 4:
                    if(this.agregarRegistroBD(p)!=0){
                        nuevo++;
                    }else{
                        errorN ++;
                        msnError += "-  Error al insertar el expediente de: "
                                + p.getNombres()+" "+p.getApellidos()+"\n";
                    }
                    break;
                default:
                    msnError += "Revise el expediente de: " + p.getNombres() 
                            + " " + p.getApellidos() + "\n";
                    break;
            }
        }
        msn = "Registros Guardados " + nuevo + "\n" +
                "Registros Modificados " + modificado + "\n" +
                "Registros Eliminados " + eliminados + "\n";
        
        if(!msnError.equals("Errores en:")){
            msn += "\n" + msnError;
        }
        listaDataPaciente = this.listarRegistrosData();
        listaAntPaciente = this.listarRegistrosAnt();
        return msn;
    }
}