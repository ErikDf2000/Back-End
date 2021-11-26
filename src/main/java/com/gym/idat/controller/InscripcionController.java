package com.gym.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.idat.model.Inscripcion;
import com.gym.idat.services.InscripcionService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/inscripcion")
public class InscripcionController {
	
	 @Autowired
	    private InscripcionService service; 
	
	
	 	@GetMapping
	    public List<Inscripcion> lista(){
	        return service.listado();
	    }
	
	    @PostMapping
	    public String agregar(@RequestBody Inscripcion inscripcion){
	        return service.save(inscripcion);
	    }
}
