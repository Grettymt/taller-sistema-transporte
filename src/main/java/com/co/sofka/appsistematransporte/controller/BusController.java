package com.co.sofka.appsistematransporte.controller;

import com.co.sofka.appsistematransporte.service.Bus;
import com.co.sofka.appsistematransporte.service.IBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("transporte")
public class BusController {
    @Autowired
    private IBus bus;

    //List<Bus> buses = new ArrayList<>();

    /*
    @GetMapping("/bus/mostrar")
    public ResponseEntity getBuses(){
        return new ResponseEntity(buses, HttpStatus.FOUND);
    }
    */


}
