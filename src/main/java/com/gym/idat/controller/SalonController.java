package com.gym.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Salon addSalon(@RequestBody Salon salon) {
        return service.save(salon);
    }
	
	 @GetMapping
	    public List<Salon> listado(){
	      return service.listado();
	    }
}
