package com.co.sofka.appsistematransporte.clases;

import com.co.sofka.appsistematransporte.interfaces.IVehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Vehiculo implements IVehiculo {
    /**
     * Atributos
     */
    protected Persona conductor;
    protected String placa;
    protected int numeroAsientos = 0;
    protected List<Persona> pasajeros;
    protected int ID;

    /**
     * Constructor
     */
    public Vehiculo() {
        this.pasajeros = new ArrayList<>();
    }

    public Vehiculo(String placa) {
        this.placa = placa;
        this.pasajeros = new ArrayList<>();
    }

    /**
     * Métodos getters y setters
     */
    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public List<Persona> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Persona> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void ingresarPasajero(Persona pasajero) {

    }

    public void bajarPasajero(Persona pasajero) {
        this.pasajeros = this.pasajeros
                .stream()
                .filter(pasajero1 -> !pasajero1.getCedula().equalsIgnoreCase(pasajero.getCedula()))
                .collect(Collectors.toList());
    }
}