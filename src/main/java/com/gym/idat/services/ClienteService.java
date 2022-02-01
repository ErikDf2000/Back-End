package com.gym.idat.services;

import java.util.List;

import com.gym.idat.Utils.other.ReservaDTO;
import com.gym.idat.Utils.other.UsuarioClienteDTO;
import com.gym.idat.model.*;
import com.gym.idat.repository.PagoRepository;
import com.gym.idat.repository.ReservaRepository;
import com.gym.idat.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.repository.ClienteRepository;


@Service
public class ClienteService {
	
	 @Autowired
	    private ClienteRepository repository;

	 @Autowired
	 private  UsuarioService usuarioService;

	 @Autowired
	 private RolRepository rolRepository;


	 

	public Cliente  save(Cliente cliente) {
		Cliente c = new Cliente();
		c=repository.save(cliente);


		String user = cliente.getApellido().trim();
		String pass = cliente.getApellido().charAt(0) + cliente.getDni();



		UsuarioClienteDTO dtoCliente = new UsuarioClienteDTO();

		dtoCliente.setCliente(cliente);
		dtoCliente.setUsuario(user);
		dtoCliente.setContrasena(pass);


		usuarioService.RegistrarUsuarioCliente(dtoCliente);

	return c;
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
