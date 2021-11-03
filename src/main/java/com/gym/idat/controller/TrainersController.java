package com.gym.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.idat.model.Trainers;
import com.gym.idat.services.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainersController {
	
	@Autowired
    private TrainerService service;

	 @GetMapping 
	    public List<Trainers>findAllTrainer(){return service.getTrainers();
	    }
	
	
    @PostMapping
    public Trainers agregar(@RequestBody Trainers trainers) { return service.save(trainers);
    }

   

    @GetMapping("/{id}")
    public Trainers findTrainerById(@PathVariable int id) {return service.getTrainerById(id);
    }

    @GetMapping("/{nombre}")
    public Trainers findTrainerByNombre(@PathVariable String nombre) { return service.getTrainerByNombre(nombre);
    }

    @PutMapping("/actualizar")
    public Trainers updateTrainer(@RequestBody Trainers trainers) { return service.updateTrainer(trainers);
    }
   
    }


    

