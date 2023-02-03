package com.co.sofka.appsistematransporte.service;

public class Bus implements IBus{

    /**
     * Atributos
     */
    public String nombreConductor;
    public String placa;
    public int cantidadAsientos;

    public Bus(String nombreConductor, String placa, int cantidadAsientos){
        this.nombreConductor = nombreConductor;
        this.placa = placa;
        this.cantidadAsientos = cantidadAsientos;
    }

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

    @Override
    public void registrarBus() {

    }

    @Override
    public void listarBuses() {

    }

}