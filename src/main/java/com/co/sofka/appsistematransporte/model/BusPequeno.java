package com.co.sofka.appsistematransporte.model;

import com.co.sofka.appsistematransporte.clases.Vehiculo;

public class BusPequeno extends Vehiculo {
    public BusPequeno(String placa){
        super(placa);
        this.numeroAsientos = 10;
    }
}
