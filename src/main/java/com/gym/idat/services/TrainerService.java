package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Trainers;
import com.gym.idat.repository.TrainerRepository;

@Service
public class TrainerService {
	
	@Autowired
    private TrainerRepository repository;

    public List<Trainers> listado(){
        return repository.findAll();
        }

    public String  save( Trainers trainers){
        repository.save(trainers);
        return "Registro Exitoso";
        }

}
