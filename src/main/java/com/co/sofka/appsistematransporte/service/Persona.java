package com.co.sofka.appsistematransporte.service;

public class Persona {
    /**
     * Atributos
     */
    String cedula;
    String nombre;
    int celular;

    /**
     * Getters y setters
     */
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}