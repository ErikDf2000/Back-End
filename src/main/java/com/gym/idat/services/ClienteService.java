package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Cliente;
import com.gym.idat.repository.ClienteRepository;


@Service
public class ClienteService {
	
	 @Autowired
	    private ClienteRepository repository;
	 	 

		
	 
	 	public Cliente save(Cliente cliente) {
	        return repository.save(cliente);
	    }

	 	/*grabar una lista--? probar--
	    public List<Cliente> save(List<Cliente> cliente) {
	        return repository.saveAll(cliente);
	    }*/

	    public List<Cliente> getClientes() {
	        return repository.findAll();
	    }

	    public Cliente getClienteById(Long id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Cliente getClienteByNombre(String nombre) {
	        return repository.findByNombre(nombre);
	    }
	    
	    public List<Cliente> findByNombreOrApellido(String n, String a){
	        return repository.findByNombreContainsOrApellidoContains(n, a);
	    }

	   

	    public Cliente updateCliente(Cliente cliente) {
	    	Cliente existingCliente = repository.findById(cliente.getId()).orElse(null);
	        existingCliente.setNombre(cliente.getNombre());
	        existingCliente.setApellido(cliente.getApellido());
	        existingCliente.setSexo(cliente.getSexo());
	        existingCliente.setCelular(cliente.getCelular());
	        existingCliente.setCorreo(cliente.getCorreo());
	        return repository.save(existingCliente);
	    }


}
