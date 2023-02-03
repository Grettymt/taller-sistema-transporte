package com.co.sofka.appsistematransporte.service;

import com.co.sofka.appsistematransporte.repository.TerminalTransporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    @Autowired
    private TerminalTransporte terminalTransporte;


}
