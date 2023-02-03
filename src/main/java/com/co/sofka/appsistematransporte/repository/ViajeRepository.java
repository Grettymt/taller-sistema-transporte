package com.co.sofka.appsistematransporte.repository;

import com.co.sofka.appsistematransporte.interfaces.IRepository;
import com.co.sofka.appsistematransporte.model.Pasajero;
import com.co.sofka.appsistematransporte.model.Viaje;

import java.util.List;

public class ViajeRepository implements IRepository<Viaje> {

    public List<Viaje> listar(){
      return TerminalTransporteRepository
              .getInstance()
              .getViajes();
    }

    public Viaje guardar(Viaje viaje){
        return TerminalTransporteRepository
                .getInstance()
                .registrarViaje(viaje);
    }

    public Viaje ingresarPasajero (int idViaje, Pasajero pasajero){
        return TerminalTransporteRepository
                .getInstance()
                .ingresarPasajero(idViaje, pasajero);
    }
}
