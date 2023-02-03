package com.co.sofka.appsistematransporte.controller;

import com.co.sofka.appsistematransporte.model.Destino;
import com.co.sofka.appsistematransporte.repository.DestinoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/destino")
public class DestinoController {

    private DestinoRepository repositorio;

    public DestinoController(){
        super();
        this.repositorio = new DestinoRepository();
    }

    @GetMapping("/listar")
    public ResponseEntity listarDestinos(){
        List<Destino> destinos =this.repositorio.listar();
        return new ResponseEntity(destinos, HttpStatus.FOUND);
    }

    @PostMapping("/guardar")
    public ResponseEntity guardarDestinos(@RequestBody Destino destino){
        Destino nuevoDestino = repositorio.guardar(destino);
        return new ResponseEntity(nuevoDestino, HttpStatus.CREATED);
    }
}
