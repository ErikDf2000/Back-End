package com.gym.idat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


	@GetMapping("/{idClient}")
	public List<Pago> findAllPagoCliente(@PathVariable  Long idClient) {
		return service.getPagoByIdCliente(idClient);
	}

	@PatchMapping("/{id}")
	public ResponseEntity<?> RealizarPago(@PathVariable  Long id) {
		return ResponseEntity.status(HttpStatus.CREATED).body( service.RealizarPago(id));
	}
}
