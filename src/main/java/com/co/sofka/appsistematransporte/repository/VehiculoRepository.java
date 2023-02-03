package com.co.sofka.appsistematransporte.repository;

import com.co.sofka.appsistematransporte.clases.Persona;
import com.co.sofka.appsistematransporte.clases.Vehiculo;

public class VehiculoRepository {

    public void asignarConductor(Vehiculo vehiculo, Persona conductor){
        vehiculo.setConductor(conductor);
    }

    public void ingresarPasajero(Vehiculo vehiculo, Persona pasajero){
        vehiculo.ingresarPasajero(pasajero);
    }

    public void bajarPasajero (Vehiculo vehiculo, Persona pasajero){
        vehiculo.bajarPasajero(pasajero);
    }
}
