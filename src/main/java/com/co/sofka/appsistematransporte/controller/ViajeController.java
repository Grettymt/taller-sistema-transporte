package com.co.sofka.appsistematransporte.controller;

import com.co.sofka.appsistematransporte.clases.Vehiculo;
import com.co.sofka.appsistematransporte.model.*;
import com.co.sofka.appsistematransporte.repository.BusRepository;
import com.co.sofka.appsistematransporte.repository.DestinoRepository;
import com.co.sofka.appsistematransporte.repository.ViajeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/viaje")
public class ViajeController {
    private ViajeRepository repositorio;

    public ViajeController() {
        this.repositorio = new ViajeRepository();
    }

    @GetMapping("/listar")
    public ResponseEntity listarViajes() {
        List<Viaje> viajes = this.repositorio.listar();
        return new ResponseEntity(viajes, HttpStatus.FOUND);
    }

    @PostMapping("/guardar/{idDestino}/{idBus}")
    public ResponseEntity guardarViaje(
            @PathVariable("idDestino") int idDestino,
            @PathVariable("idBus") int idBus,
            @RequestBody Viaje viaje) {
        Destino destino = DestinoRepository.getPorId(idDestino);
        Vehiculo bus = BusRepository.getPorId(idBus);
        viaje.setDestino(destino);
        viaje.setBus(bus);
        Viaje nuevoViaje = this.repositorio.guardar(viaje);
        return new ResponseEntity(nuevoViaje, HttpStatus.CREATED);
    }

    @PostMapping("/ingresar-pasajero/{idViaje}")
    public ResponseEntity ingresarPasajero(
            @PathVariable("idViaje") int idViaje,
            @RequestBody Pasajero pasajero) {
        Viaje viaje = this.repositorio.ingresarPasajero(
                idViaje,
                pasajero
        );
        return new ResponseEntity(viaje, HttpStatus.FOUND);
    }
}