package com.co.sofka.appsistematransporte.model;

import com.co.sofka.appsistematransporte.clases.Vehiculo;

public class Viaje {
    private Destino destino;
    private String hora;
    private Vehiculo bus;
    private boolean finalizado = false;
    private int ID;

    public Viaje(){

    }

    public Viaje(Destino destino, String hora, Vehiculo bus){
        this.destino = destino;
        this.hora = hora;
        this.bus = bus;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Vehiculo getBus() {
        return bus;
    }

    public void setBus(Vehiculo bus) {
        this.bus = bus;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
