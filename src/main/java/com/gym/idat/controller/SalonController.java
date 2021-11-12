package com.gym.idat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.idat.model.Salon;
import com.gym.idat.services.SalonService;

@RestController //indica que es un Servicio REST
@RequestMapping("/salon")
public class SalonController {

	@Autowired
	private SalonService service;
	
	@PostMapping
    public Salon addSalon(@RequestBody Salon disciplinas) {
        return service.save(disciplinas);
    }
}
