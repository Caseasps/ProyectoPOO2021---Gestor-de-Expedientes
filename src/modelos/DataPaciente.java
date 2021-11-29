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
public class DataPaciente{
    
    private String apellidos;
    private String id;
    private String nombres;
    private int estado; // 1. Original, 2. Modificado, 3. Eliminado, 4. Nuevo
    private String direccion;
    private int edad;
    private String escolaridad;
    private String fechaNac;
    private String grupoEtnico;
    private String nombreMadre;
    private String nombrePadre;
    private String oficio;
    private String sexo;

    public DataPaciente() {
    }

    public DataPaciente(String apellidos, String id, String nombres, 
            int estado, String direccion, int edad, String escolaridad, 
            String fechaNac, String grupoEtnico, String nombreMadre, 
            String nombrePadre, String oficio, String sexo) {
        this.apellidos = apellidos;
        this.id = id;
        this.nombres = nombres;
        this.estado = estado;
        this.direccion = direccion;
        this.edad = edad;
        this.escolaridad = escolaridad;
        this.fechaNac = fechaNac;
        this.grupoEtnico = grupoEtnico;
        this.nombreMadre = nombreMadre;
        this.nombrePadre = nombrePadre;
        this.oficio = oficio;
        this.sexo = sexo;
    }

     public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getGrupoEtnico() {
        return grupoEtnico;
    }

    public void setGrupoEtnico(String grupoEtnico) {
        this.grupoEtnico = grupoEtnico;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
