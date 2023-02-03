package com.co.sofka.appsistematransporte.interfaces;

import com.co.sofka.appsistematransporte.clases.Persona;
import com.co.sofka.appsistematransporte.clases.Vehiculo;

/**
 * Interface Vehiculo, la cual será implementada por la clase abstracta Vehiculo
 */
public interface IVehiculo {
    public void ingresarPasajero(Persona pasajero);
    public void bajarPasajero (Persona persona);
}
