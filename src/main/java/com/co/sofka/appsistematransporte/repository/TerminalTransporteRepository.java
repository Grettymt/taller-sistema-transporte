package com.co.sofka.appsistematransporte.repository;

import com.co.sofka.appsistematransporte.clases.Vehiculo;
import com.co.sofka.appsistematransporte.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalTransporteRepository {
    private List<Vehiculo> buses;
    private List<Destino> destinos;
    private List<Viaje> viajes;
    private int idDestinos = 1;
    private int idViajes = 1;
    private int idBuses = 1;

    //Singleton
    private static TerminalTransporteRepository instancia = null;

    private TerminalTransporteRepository() {
        this.buses = new ArrayList<>();
        this.destinos = new ArrayList<>();
        this.viajes = new ArrayList<>();
    }

    public static TerminalTransporteRepository getInstance() {
        if (instancia == null) {
            instancia = new TerminalTransporteRepository();
        }
        return instancia;
    }

    public Vehiculo registrarBus(Vehiculo vehiculoACrear) {
        Bus bus = (Bus) vehiculoACrear;
        String tipo = bus.getTipo();
        Vehiculo nuevoVehiculo;

        if (tipo.equalsIgnoreCase("grande")) {
            nuevoVehiculo = new BusGrande(bus.getPlaca());
        } else if (tipo.equalsIgnoreCase("mediano")) {
            nuevoVehiculo = new BusMediano(bus.getPlaca());
        } else if (tipo.equalsIgnoreCase("pequeno")) {
            nuevoVehiculo = new BusPequeno(bus.getPlaca());
        } else {
            nuevoVehiculo = bus;
        }
        nuevoVehiculo.setID(this.idBuses);
        this.buses.add(nuevoVehiculo);
        this.idBuses++;
        return nuevoVehiculo;
    }

    public Destino registrarDestino(Destino destinoARegistrar) {
        Destino nuevoDestino = new Destino(
                this.idDestinos,
                destinoARegistrar.getNombreDestino(),
                destinoARegistrar.getDepartamento(),
                destinoARegistrar.getCiudad()
        );
        this.destinos.add(nuevoDestino);
        this.idDestinos++;
        return nuevoDestino;
    }

    public Viaje registrarViaje(Viaje viajeAcrear) {
        viajeAcrear.setID(this.idViajes);
        this.idViajes++;
        this.viajes.add(viajeAcrear);
        return viajeAcrear;
    }

    public List<Vehiculo> getBuses() {
        return this.buses;
    }

    public List<Viaje> getViajes() {
        return this.viajes;
    }

    public List<Destino> getDestinos() {
        return this.destinos;
    }

    public Vehiculo asignarConductor(String placa, Conductor conductor) {
        Vehiculo vehiculo = this.buses
                .stream()
                .filter(vehiculo1 -> vehiculo1.getPlaca().equalsIgnoreCase(placa))
                .findFirst()
                .orElse(null);

        if (vehiculo != null) {
            vehiculo.setConductor(conductor);
            this.buses = this.buses.stream()
                    .map(vehiculo1 -> vehiculo1
                            .getPlaca()
                            .equalsIgnoreCase(placa) ?
                            vehiculo : vehiculo1
                    ).collect(Collectors.toList());
        }
        return vehiculo;
    }

    public Viaje ingresarPasajero(int idViaje, Pasajero pasajero) {
        Viaje viaje = this.viajes
                .stream()
                .filter(viaje1 -> viaje1.getID() == idViaje)
                .findFirst()
                .orElse(null);
        if (viaje != null && viaje.getBus() != null) {
            viaje.getBus().ingresarPasajero(pasajero);
        }
        return viaje;
    }
}