package com.co.sofka.appsistematransporte.model;

import com.co.sofka.appsistematransporte.clases.Vehiculo;

/**
 * Esta clase se usa de base para instanciar un vehículo
 * de la clase Vehículo.
 * El tipo de vehículo puede ser: grande, mediano o pequeno.
 */
public class Bus extends Vehiculo {
    /**
     * Atributos
     */
    private String tipo;


    /**
     * Métodos getters y setters
     */
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
