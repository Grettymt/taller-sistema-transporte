package com.co.sofka.appsistematransporte.model;

import com.co.sofka.appsistematransporte.clases.Vehiculo;

public class BusMediano extends Vehiculo {
    public BusMediano(String placa){
        super(placa);
        this.numeroAsientos = 20;
    }
}
