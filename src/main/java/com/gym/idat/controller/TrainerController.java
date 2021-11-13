package com.gym.idat.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gym.idat.Utils.other.TrainerDTO;
import com.gym.idat.model.Trainers;
import com.gym.idat.services.TrainerService;


@RestController
@RequestMapping("/trainer")
public class TrainerController {

	
	@Autowired
    private TrainerService service;

	 @GetMapping 
	    public List<Trainers>findAllTrainer(){
		 
		 return service.getTrainers();
	    }
	
	
    @PostMapping
    public Trainers agregar(@RequestBody Trainers trainers) { 
    	
    	return service.save(trainers);
    }

   

    @GetMapping("/{id}")
    public Trainers findTrainerById(@PathVariable Long id) {
    	
    	return service.getTrainerById(id);
    }

    
    @GetMapping(value = "/buscar")
    public ResponseEntity<?> findByNombreOrApellido(@RequestParam String dato){
        List<Trainers> find = service.findByNombreOrApellido(dato, dato);
        return ResponseEntity.status(HttpStatus.OK).body(find);
    }
   

    /*@PutMapping("/actualizar")
    public Trainers updateTrainer(@RequestBody Trainers trainers) 
    { return service.updateTrainer(trainers);
    }*/
    @PutMapping("/update")
    public ResponseEntity<?> updateTrainer(@RequestBody TrainerDTO trainerDTO){
        return service.UpdateTrainer(trainerDTO);
    }
}
