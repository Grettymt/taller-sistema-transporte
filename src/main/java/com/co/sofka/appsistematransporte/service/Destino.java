package com.co.sofka.appsistematransporte.service;

public abstract class Destino {
    /**
     * Atributos
     */
    String nombreDestino;

    /**
     * Getters y setters
     */
    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }
}