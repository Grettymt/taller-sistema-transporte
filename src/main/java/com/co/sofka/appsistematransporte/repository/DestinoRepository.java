package com.co.sofka.appsistematransporte.repository;

import com.co.sofka.appsistematransporte.clases.Vehiculo;
import com.co.sofka.appsistematransporte.interfaces.IRepository;
import com.co.sofka.appsistematransporte.model.Destino;

import java.util.List;

public class DestinoRepository implements IRepository<Destino> {
    public List<Destino> listar(){
        return TerminalTransporteRepository
                .getInstance()
                .getDestinos();
    }

    public Destino guardar(Destino destino){

        return TerminalTransporteRepository
                .getInstance()
                .registrarDestino(destino);
    }

    public static Destino getPorId (int id){
        List<Destino> destinos = TerminalTransporteRepository
                .getInstance()
                .getDestinos();
        return destinos.stream()
                .filter(destino -> destino.getID() == id)
                .findFirst()
                .orElse(null);
    }
}