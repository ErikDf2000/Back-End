package com.gym.idat.controller;


import com.gym.idat.model.Clase;
import com.gym.idat.services.ClaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clase")
public class ClaseController {

    @Autowired
    private ClaseService service;

    @GetMapping
    public List<Clase>findAllClase(){ return service.listado();}

    @PostMapping
    public String agregar(@RequestBody Clase clase){return service.save(clase);}
    
    @DeleteMapping("/{id}")
    public String deleteClase(@PathVariable int id) {return service.deleteClase(id); }

}
