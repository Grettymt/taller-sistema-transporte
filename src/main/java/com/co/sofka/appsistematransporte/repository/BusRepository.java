package com.co.sofka.appsistematransporte.repository;

import com.co.sofka.appsistematransporte.clases.Vehiculo;
import com.co.sofka.appsistematransporte.interfaces.IRepository;
import com.co.sofka.appsistematransporte.model.Conductor;

import java.util.List;

public class BusRepository implements IRepository<Vehiculo> {

    public List<Vehiculo> listar(){
        return TerminalTransporteRepository
                .getInstance()
                .getBuses();
    }

    public Vehiculo guardar(Vehiculo vehiculo){
        return TerminalTransporteRepository
                .getInstance()
                .registrarBus(vehiculo);
    }

    public Vehiculo asignarConductor(String placa, Conductor conductor){
        return TerminalTransporteRepository
                .getInstance()
                .asignarConductor(placa, conductor);
    }

    public static Vehiculo getPorId (int id){
        List<Vehiculo> buses = TerminalTransporteRepository
                .getInstance()
                .getBuses();
        return buses.stream()
                .filter(vehiculo -> vehiculo.getID() == id)
                .findFirst()
                .orElse(null);
    }
}