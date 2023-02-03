package com.co.sofka.appsistematransporte.model;

import com.co.sofka.appsistematransporte.clases.Persona;

public class Pasajero extends Persona {
    private int numeroMaletas = 0;

    public int getNumeroMaletas() {
        return numeroMaletas;
    }

    public void setNumeroMaletas(int numeroMaletas) {
        this.numeroMaletas = numeroMaletas;
    }
}
