package com.co.sofka.appsistematransporte.model;

public class Destino {
    private String nombreDestino;
    private String departamento;
    private String ciudad;
    private int ID;

    public Destino(){

    }

    public Destino(String nombreDestino, String departamento, String ciudad){
        this.nombreDestino = nombreDestino;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    public Destino(int ID, String nombreDestino, String departamento, String ciudad){
        this.ID = ID;
        this.nombreDestino = nombreDestino;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
