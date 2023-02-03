package com.co.sofka.appsistematransporte.interfaces;

import java.util.List;

//Genéricos <>
public interface IRepository<TipoDeModelo> {
    public List<TipoDeModelo> listar();
    public TipoDeModelo guardar(TipoDeModelo modelo);
}
