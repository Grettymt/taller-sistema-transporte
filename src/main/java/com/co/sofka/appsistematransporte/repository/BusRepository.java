package com.co.sofka.appsistematransporte.repository;

import com.co.sofka.appsistematransporte.clases.Vehiculo;
import com.co.sofka.appsistematransporte.interfaces.IRepository;

import java.util.ArrayList;
import java.util.List;

public class BusRepository implements IRepository<Vehiculo> {
    public List<Vehiculo> listar(){
        return new ArrayList<>();
    }

    public Vehiculo guardar(Vehiculo vehiculo){
        return null;
    }

}
