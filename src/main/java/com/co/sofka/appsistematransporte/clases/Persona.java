package com.co.sofka.appsistematransporte.clases;

public abstract class Persona {
    /**
     * Atributos
     */
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String telefono;

    /**
     * Constructor
     */
    public Persona(){

    }

    /**
     * Sobrecarga del constructor
     */
    public Persona(String nombre, String apellido, String cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }


    /**
     * Métodos getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
