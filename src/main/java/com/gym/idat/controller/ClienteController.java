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

import com.gym.idat.model.Cliente;
import com.gym.idat.services.ClienteService;


@RestController //indica que es un Servicio REST
@RequestMapping("/cliente")
public class ClienteController {

	 	@Autowired
	    private ClienteService service;

	    @PostMapping
	    public Cliente agregar(@RequestBody Cliente cliente) {
	        return service.save(cliente);
	    }

	  
	    @GetMapping
	    public List<Cliente> findAllCliente() {
	        return service.getClientes();
	    }

	    @GetMapping("/{id}")
	    public Cliente findClienteById(@PathVariable Long id) {
	        return service.getClienteById(id);
	    }

	    @GetMapping("/{nombre}")
	    public Cliente findClienteByNombre(@PathVariable String nombre) {
	        return service.getClienteByNombre(nombre);
	    }

	    @PutMapping("/actualizar")
	    public Cliente updateCliente(@RequestBody Cliente cliente) {
	        return service.updateCliente(cliente);
	    }

	   
}
