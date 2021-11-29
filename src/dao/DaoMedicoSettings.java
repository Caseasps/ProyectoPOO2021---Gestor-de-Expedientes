/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    private PreparedStatement editarDatosPersonales;
    private PreparedStatement editarCredenciales;
    
    public DaoMedicoSettings() {
        try {
            conn = conexion.obtenerConexion();
            editarDatosPersonales = conn.prepareStatement("Update MedicoLogin "
                    + "set nombre = ?, apellido = ?, especialidad = ? "
                    + "where id = 1"); 
            
            editarCredenciales = conn.prepareStatement("Update MedicoLogin "
                    + "set usuario = ?, pw = ? "
                    + "where id = 1");

        } catch (SQLException ex) {
            Logger.getLogger(DaoMedicoSettings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int editarDatosMedico(String nombre, String apellido, String especialidad, Medico m){
        int b = 0;
        try{
            m.setNombre(nombre);
            m.setApellido(apellido);
            m.setEspecialidad(especialidad);
            return 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    public int editarCredMedico(String usuario, String pw, Medico m){
        int b = 0;
        try{
            m.setUsuario(usuario);
            m.setPw(pw);
            return 1;
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return b;
    }
    
    public int modificarDatosMBD(Medico m){
        int r = 0;
        try{
            editarDatosPersonales.setString(1, m.getNombre());
            editarDatosPersonales.setString(2, m.getApellido());
            editarDatosPersonales.setString(3, m.getEspecialidad());
            r = editarDatosPersonales.executeUpdate();
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al modificar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;
                
    }
    
    public int modificarCredsMBD(Medico m){
        int r = 0;
        try{
            editarCredenciales.setString(1, m.getUsuario());
            editarCredenciales.setString(2, m.getPw());
            r = editarCredenciales.executeUpdate();
        }catch(SQLException ex ){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al modificar en BD", 
                    JOptionPane.ERROR_MESSAGE);
            conexion.close(conn);
        }
        return r;          
    }
    
    public String actualizarDataBD(Medico m){

        String msn ="Datos actualizados exitosamente";
        String msnError = "Error. ";
        
        if (this.modificarDatosMBD(m) != 0){
            return msn;
        }else{
            msnError += "Error al modifcar datos";
        }

        if(!msnError.equals("Error. ")){
            msn += "\n" + msnError;
        }
        
        return msn;
    }
    
    public String actualizarCredsBD(Medico m){

        String msn ="Datos actualizados exitosamente";
        String msnError = "Error. ";
        
        if (this.modificarCredsMBD(m) != 0){
            return msn;
        }else{
            msnError += "Error al modifcar datos";
        }

        if(!msnError.equals("Error. ")){
            msn += "\n" + msnError;
        }
        
        return msn;
    }
}
