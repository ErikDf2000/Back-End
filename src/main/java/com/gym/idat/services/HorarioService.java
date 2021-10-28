package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Horario;
import com.gym.idat.repository.HorarioRepository;

@Service
public class HorarioService {
		@Autowired
	    private HorarioRepository repository;

	    public List<Horario> listado(){
	        return repository.findAll();}

	    public String  save(Horario horario){
	        repository.save(horario);
	        return "Registro Exitoso";}

}
