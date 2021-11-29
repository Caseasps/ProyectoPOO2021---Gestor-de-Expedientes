/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author 
 */
public class Medico {
    
    private String apellido;
    private String especialidad;
    private String nombre;
    private String pw;
    private String usuario;

    public Medico() {
    }

    public Medico(String apellido, String especialidad, String nombre, String pw, String usuario) {
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.pw = pw;
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
        
      
        
        
        
}
