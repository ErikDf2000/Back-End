package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Rol;
import com.gym.idat.repository.RolRepository;

@Service
public class RolService {
	
	@Autowired
	private RolRepository repoRol;
	
	public List<Rol> ListarUsuario() {
        return repoRol.findAll();
    }



}
