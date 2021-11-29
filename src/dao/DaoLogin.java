/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class DaoLogin {
    
    private Connection conn ;
    private final Conexion conexion = new Conexion();
    private PreparedStatement verCredenciales;
    
    public DaoLogin() {
        try {
            conn = conexion.obtenerConexion();
            verCredenciales = conn.prepareStatement("Select pw from Expedientes where usuario = ?");
        } catch (SQLException ex) {
            Logger.getLogger(DaoLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    String obtenerCredenciales(String user){
        ResultSet rs = null;
        String PW = null;
       
        try{
            verCredenciales.setString(1, user);
            rs = verCredenciales.executeQuery();
            
            while (rs.next()){
                PW = rs.getString("pw");
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
        return PW;
    }
    
}