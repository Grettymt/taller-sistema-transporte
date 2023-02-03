package com.co.sofka.appsistematransporte.repository;

import com.co.sofka.appsistematransporte.clases.Vehiculo;
import com.co.sofka.appsistematransporte.model.Destino;
import com.co.sofka.appsistematransporte.model.Viaje;

import java.util.ArrayList;
import java.util.List;

public class TerminalTransporteRepository {
    private List<Vehiculo> buses;
    private List<Destino> destinos;
    private List<Viaje> viajes;
    private int idDestinos = 1;
    private int idViajes = 1;
    private int idBuses = 1;

    //Singleton
    private static TerminalTransporteRepository instancia = null;

    private TerminalTransporteRepository (){
        this.buses = new ArrayList<>();
        this.destinos = new ArrayList<>();
        this.viajes = new ArrayList<>();
    }

    public static TerminalTransporteRepository getInstance(){
        if (instancia == null){
            instancia = new TerminalTransporteRepository();
        }
        return instancia;
    }

    public void registrarbus(){

    }

    public Destino registrarDestino(Destino destinoARegistrar){
        Destino nuevoDestino = new Destino(
                this.idDestinos,
                destinoARegistrar.getNombreDestino(),
                destinoARegistrar.getDepartamento(),
                destinoARegistrar.getCiudad()
        );
        this.destinos.add(nuevoDestino);
        this.idDestinos ++;
        return nuevoDestino;
    }

    public List<Viaje> registrarViaje(){
        return this.viajes;
    }

    public List<Vehiculo> getBuses (){
        return this.buses;
    }

    public List<Destino> getDestinos(){
        return this.destinos;
    }
}