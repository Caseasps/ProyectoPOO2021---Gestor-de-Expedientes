/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Antecedentes{
    
    private String idP;
    private String alimentacion;
    private String consumo;
    private int horasActFisica;
    private int horasLaborales;
    private boolean inmunizacion;
    private String cirugias;
    private String enfCronicas;
    private String enfInfectoCont;
    private String hospitalizaciones;
    private String enfContag;
    private String enfHereditaria;

    public Antecedentes() {
    }

    public Antecedentes(String idP, String alimentacion, String consumo, int horasActFisica, int horasLaborales, boolean inmunizacion, String cirugias, String enfCronicas, String enfInfectoCont, String hospitalizaciones, String enfContag, String enfHereditaria) {
        this.idP = idP;
        this.alimentacion = alimentacion;
        this.consumo = consumo;
        this.horasActFisica = horasActFisica;
        this.horasLaborales = horasLaborales;
        this.inmunizacion = inmunizacion;
        this.cirugias = cirugias;
        this.enfCronicas = enfCronicas;
        this.enfInfectoCont = enfInfectoCont;
        this.hospitalizaciones = hospitalizaciones;
        this.enfContag = enfContag;
        this.enfHereditaria = enfHereditaria;
    }

    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }
       
    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getHorasActFisica() {
        return horasActFisica;
    }

    public void setHorasActFisica(int horasActFisica) {
        this.horasActFisica = horasActFisica;
    }

    public int getHorasLaborales() {
        return horasLaborales;
    }

    public void setHorasLaborales(int horasLaborales) {
        this.horasLaborales = horasLaborales;
    }

    public boolean isInmunizacion() {
        return inmunizacion;
    }

    public void setInmunizacion(boolean inmunizacion) {
        this.inmunizacion = inmunizacion;
    }

    public String getCirugias() {
        return cirugias;
    }

    public void setCirugias(String cirugias) {
        this.cirugias = cirugias;
    }

    public String getEnfCronicas() {
        return enfCronicas;
    }

    public void setEnfCronicas(String enfCronicas) {
        this.enfCronicas = enfCronicas;
    }

    public String getEnfInfectoCont() {
        return enfInfectoCont;
    }

    public void setEnfInfectoCont(String enfInfectoCont) {
        this.enfInfectoCont = enfInfectoCont;
    }

    public String getHospitalizaciones() {
        return hospitalizaciones;
    }

    public void setHospitalizaciones(String hospitalizaciones) {
        this.hospitalizaciones = hospitalizaciones;
    }

    public String getEnfContag() {
        return enfContag;
    }

    public void setEnfContag(String enfContag) {
        this.enfContag = enfContag;
    }

    public String getEnfHereditaria() {
        return enfHereditaria;
    }

    public void setEnfHereditaria(String enfHereditaria) {
        this.enfHereditaria = enfHereditaria;
    } 
}
