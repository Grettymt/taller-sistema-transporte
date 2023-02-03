package com.co.sofka.appsistematransporte.repository;

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
}
