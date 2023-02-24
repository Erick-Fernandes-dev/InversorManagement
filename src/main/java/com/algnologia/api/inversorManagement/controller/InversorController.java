package com.algnologia.api.inversorManagement.controller;

import com.algnologia.api.inversorManagement.domain.Inversor;
import com.algnologia.api.inversorManagement.domain.InversorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("inversors")
public class InversorController {

    @Autowired
    private InversorRepository repository;

    @PostMapping
    public void cadastra(@RequestBody Inversor inversor) {
        this.repository.save(inversor);
    }

    @GetMapping("/{numeroSerie}")
    public Inversor getInversor(@PathVariable String numeroSerie) {
       Inversor inversorEncontrado = this.repository.findBynumeroSerie(numeroSerie);

       return inversorEncontrado;

    }



}
