/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelos.Medico;

/**
 *
 * @author
 */
public class DaoMedicoSettings {
    
    private Connection conn ;
    private final Conexion conexion = new Conexion();
    private PreparedStatement editarDatosyCreds;
    private PreparedStatement verDataMedico;
    private ArrayList<Medico> listaMedico = new ArrayList();
    
    public DaoMedicoSettings() {
        try {
            conn = conexion.obtenerConexion();
            editarDatosyCreds = conn.prepareStatement("Update MedicoLogin "
                    + "set nombre = ?, apellido = ?, especialidad = ?, "
                    + "usuario = ?, pw = ? "
                    + "where id = 1");
            
            verDataMedico = conn.prepareStatement("Select * from MedicoLogin");
        } catch (SQLException ex) {
            Logger.getLogger(DaoMedicoSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
        listaMedico = this.listarRegistrosMedico();
    }
    
    public ArrayList<Medico> getListaMedico(){
        return listaMedico;
    }
    
    public int editarDatosMedico(String nombre, String apellido, String especialidad){
        int b = 0;
        try{
            for(Medico m : listaMedico){
                m.setNombre(nombre);
                m.setApellido(apellido);
                m.setEspecialidad(especialidad);
            }
            return 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    public int editarCredMedico(String usuario, String pw){
        int b = 0;
        try{
            for(Medico m : listaMedico){
                m.setUsuario(usuario);
                m.setPw(pw);
            }
            return 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    public ArrayList<Medico> listarRegistrosMedico(){
        ArrayList<Medico> listado = null;
        ResultSet rs = null;
        try{
            rs = verDataMedico.executeQuery();
            listado = new ArrayList();
            while(rs.next()){
                listado.add(new Medico(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("especialidad"),
                        rs.getString("usuario"),
                        rs.getString("pw")
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
    
    public int modificarDatosMBD(Medico m){
        int r = 0;
        try{
            editarDatosyCreds.setString(1, m.getNombre());
            editarDatosyCreds.setString(2, m.getApellido());
            editarDatosyCreds.setString(3, m.getEspecialidad());
            editarDatosyCreds.setString(4, m.getUsuario());
            editarDatosyCreds.setString(5, m.getPw());
            r = editarDatosyCreds.executeUpdate();
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al modificar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;
                
    }
    
    public String actualizarDataBD(){

        String msn ="Datos actualizados exitosamente";
        String msnError = "Error. ";
        
        for(Medico m : listaMedico){
            if (this.modificarDatosMBD(m) != 0){
                    return msn;
            }else{
            msnError += "Error al modifcar datos";
            }
            if(!msnError.equals("Error. ")){
                msn += "\n" + msnError;
            }
        }
        return msn;
    }
}
