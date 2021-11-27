package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Disciplinas;
import com.gym.idat.model.Inscripcion;
import com.gym.idat.repository.InscripcionRepository;

@Service
public class InscripcionService {
	
	 @Autowired
	    private InscripcionRepository repository;
	
	 public List<Inscripcion> listado(){
	        return repository.findAll();
	    }
	
	    /*public String  save(Inscripcion clase){
	        repository.save(clase);
	        return "Registro Exitoso";
	    }*/
	    
	    public Inscripcion save(Inscripcion inscripcion) {
	        return repository.save(inscripcion);
	    }
}
