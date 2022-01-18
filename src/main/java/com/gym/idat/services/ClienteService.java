package com.gym.idat.services;

import java.util.List;

import com.gym.idat.Utils.other.ReservaDTO;
import com.gym.idat.model.Mensualidad;
import com.gym.idat.model.Pago;
import com.gym.idat.model.Reserva;
import com.gym.idat.repository.PagoRepository;
import com.gym.idat.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Cliente;
import com.gym.idat.repository.ClienteRepository;


@Service
public class ClienteService {
	
	 @Autowired
	    private ClienteRepository repository;



	 

	public String save(Cliente cliente) {


	        repository.save(cliente);



		return "Alumno \""+cliente.getNombre() +"\" creado.";
	    }



	    public List<Cliente> getClientes() {
	        return repository.findAll();
	    }

	    public Cliente getClienteById(Long id) {
	        return repository.findById(id).orElse(null);
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

	        existingCliente.setFoto(cliente.getFoto());
	        return repository.save(existingCliente);
	    }

}
