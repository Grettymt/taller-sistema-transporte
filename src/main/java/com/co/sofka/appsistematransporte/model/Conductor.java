package com.co.sofka.appsistematransporte.model;

import com.co.sofka.appsistematransporte.clases.Persona;

public class Conductor extends Persona {
    private String numeroLicencia = "";

    public Conductor(String nombre, String apellido, String cedula, String numeroLicencia){
        super(nombre, apellido, cedula);
        this.numeroLicencia = numeroLicencia;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
}
