/*
 * Clase para el funcionamiento del Login.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin Majewsky & Eleazar Cortez
 */
public class DaoLogin {
    
    private Connection conn ;
    private final Conexion conexion = new Conexion();
    private PreparedStatement verCredenciales;
    
    public DaoLogin() {
        try {
            conn = conexion.obtenerConexion();
            verCredenciales = conn.prepareStatement("Select pw from MedicoLogin where usuario = ?");
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Obtiene las credenciales ingresadas y las compara con credenciales 
     * guardadas en la base de datos.
     * Devuelve varible boolean para determinar si hay acceso o no al programa
     * @param user Usuario ingresado
     * @param pw Contraseña ingresada
     * @return acceso Booleano determinando acceso a programa
     */    
    public Boolean verificarCredenciales(String user, String pw){
        ResultSet rs = null;
        Boolean acceso = false;
        String pwBD = null;
       
        try{
            verCredenciales.setString(1, user);
            rs = verCredenciales.executeQuery();
            
            while (rs.next()){
                pwBD = rs.getString("pw");
            }
            if (pw.equals(pwBD)){
                return true;
            }
            else{
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas."
                    + "\n Intente nuevamente"
                    , "Login", JOptionPane.WARNING_MESSAGE);
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
        return acceso;
    }
    
}