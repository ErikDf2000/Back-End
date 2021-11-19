package com.gym.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gym.idat.model.Pago;
import com.gym.idat.services.PagoService;

@RestController //indica que es un Servicio REST
@RequestMapping("/pago")
public class PagoController {

	@Autowired
    private PagoService service;

	 @PostMapping
	    public Pago addPago(@RequestBody Pago pago) {
	        return service.save(pago);
	    }

	   @GetMapping
	    public List<Pago> findAllPago() {
	        return service.getPago();
	    }
}
