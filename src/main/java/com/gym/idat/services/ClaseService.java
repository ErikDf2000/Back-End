package com.gym.idat.services;

import com.gym.idat.Utils.other.ClaseDTO;
import com.gym.idat.model.*;
import com.gym.idat.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClaseService {

    @Autowired
    private ClaseRepository repository;

    @Autowired
    private DisciplinaRepository repositorydisc;
    @Autowired
    private TrainerRepository repositorytrai;
    @Autowired
    private SalonRepository repositorysal;
    
    public List<Clase> listado(){
        return repository.findAll();
    }
/*
    public String  save(Clase clase){
        repository.save(clase);
        return "Registro Exitoso";
    }*/

    public Clase updateClase(Clase clase) {
    	Clase existingClase = repository.findById(clase.getId()).orElse(null);
    	existingClase.setCuposmax(clase.getCuposmax());
        existingClase.setDisciplina(clase.getDisciplina());
        existingClase.setSalon(clase.getSalon());
        return repository.save(existingClase);
    }
    
    public ResponseEntity<?> RealizarServiceClase(ClaseDTO claseDTO){
        Disciplinas disciplina = repositorydisc.findDisciplinaById(claseDTO.getDisciplina());
        Trainers trainer = repositorytrai.findTrainerById(claseDTO.getTrainer());
        Salon salon = repositorysal.findSalonById(claseDTO.getSalon());       
        Map<String, Object> respon = new HashMap<>();

        Clase pago = new Clase();
        pago.setDisciplina(disciplina);
        pago.setTrainers(trainer);
        pago.setSalon(salon);
        pago.setCuposmax(claseDTO.getCuposmax());
        repository.save(pago);

        respon.put("Message", "Realizado correctamente");
        return new ResponseEntity<>(respon ,HttpStatus.OK);
    }
}
