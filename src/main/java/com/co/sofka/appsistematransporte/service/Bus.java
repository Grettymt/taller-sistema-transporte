package com.co.sofka.appsistematransporte.service;

public abstract class Bus {

    /**
     * Atributos
     */
    String nombreConductor;
    String placa;
    int cantidadAsientos;

    /**
     * Getters y setters
     */
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }
}