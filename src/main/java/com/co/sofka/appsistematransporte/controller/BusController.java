package com.co.sofka.appsistematransporte.controller;

import com.co.sofka.appsistematransporte.clases.Vehiculo;
import com.co.sofka.appsistematransporte.model.Bus;
import com.co.sofka.appsistematransporte.model.Conductor;
import com.co.sofka.appsistematransporte.repository.BusRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    private BusRepository repositorio;

    public BusController() {
        this.repositorio = new BusRepository();
    }

    @GetMapping("/listar")
    public ResponseEntity listarBuses() {
        List<Vehiculo> buses = this.repositorio.listar();
        return new ResponseEntity(buses, HttpStatus.FOUND);
    }

    @PostMapping("/guardar")
    public ResponseEntity guardarBus(@RequestBody Bus bus) {
        Vehiculo vehiculo = this.repositorio.guardar(bus);
        return new ResponseEntity(vehiculo, HttpStatus.CREATED);
    }

    @PutMapping("/asignar/{placa}")
    public ResponseEntity asignarconductor(
            @PathVariable("placa") String placa,
            @RequestBody Conductor conductor) {
        Vehiculo vehiculo = this.repositorio.asignarConductor(placa, conductor);
        if (vehiculo == null){
            HashMap<String, String> error = new HashMap<>();
            error.put("Error", "No existe el vehículo");
            return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(vehiculo, HttpStatus.FOUND);
    }
}