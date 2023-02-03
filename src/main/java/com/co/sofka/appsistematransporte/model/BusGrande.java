package com.co.sofka.appsistematransporte.model;

import com.co.sofka.appsistematransporte.clases.Vehiculo;

public class BusGrande extends Vehiculo {
    public BusGrande(String placa){
        super(placa);
        this.numeroAsientos = 30;
    }

}
