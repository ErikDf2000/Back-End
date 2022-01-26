package com.gym.idat.controller;


import com.gym.idat.Utils.other.ClaseDTO;
import com.gym.idat.model.Clase;
import com.gym.idat.services.ClaseService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/clase")
public class ClaseController {

    @Autowired
    private ClaseService service;

    @GetMapping
    public List<Clase> lista(){
        return service.listado();
    }
/*
    @PostMapping
    public String agregar(@RequestBody Clase clase){
        return service.save(clase);
    }*/

    @PostMapping("/realizar")
    public ResponseEntity<?> RealizarClase(@RequestBody ClaseDTO claseDTO){
        return service.RealizarServiceClase(claseDTO);
    }
    
    /*@PutMapping("/actualizar")
    public Clase updateClase(@RequestBody Clase clase) {
        return service.updateClase(clase);
    }*/
    
    @PutMapping("/actualizar")
    public ResponseEntity<?> updateClase(@RequestBody ClaseDTO claseDTO){
        return service.updateClase(claseDTO);
    }
    
    @GetMapping("/disciplina/{id}")
    public ResponseEntity<?> claseBydisciplina(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getClasesByIdDisciplina(id));
    }
    
    @GetMapping("/buscar/{fecha}/{id}")
    public List<Clase> listado( @PathVariable String fecha,@PathVariable Long  id){
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	LocalDate ld = LocalDate.parse(fecha, formatter);

    	LocalDateTime day = LocalDateTime.of(ld,LocalTime.of(23,59));
    	LocalDateTime dey = LocalDateTime.of(ld,LocalTime.of(00,00));
        return service.listado(day,dey,id);
    }
}
