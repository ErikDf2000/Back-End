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

    /*public Clase updateClase(Clase clase) {
    	Clase existingClase = repository.findById(clase.getId()).orElse(null);
    	existingClase.setCuposmax(clase.getCuposmax());
        existingClase.setDisciplina(clase.getDisciplina());
        existingClase.setSalon(clase.getSalon());
        return repository.save(existingClase);
    }*/
    public ResponseEntity<?> updateClase(ClaseDTO claseDTO) {
        Map<String, Object> respon = new HashMap<>();
        Disciplinas disciplina = repositorydisc.findDisciplinaById(claseDTO.getDisciplina());
        Trainers trainers = repositorytrai.findTrainerById(claseDTO.getTrainer());
        Salon salon = repositorysal.findSalonById(claseDTO.getTrainer());
        Clase clase = repository.findClaseById(claseDTO.getId());

        {

            clase.setDisciplina(disciplina);
            clase.setTrainers(trainers);
            clase.setSalon(salon);
            clase.setCuposmax(claseDTO.getCuposmax());
            clase.setHoraIni(claseDTO.getHoraIni());
            clase.setHoraFin(claseDTO.getHoraFin());
            repository.save(clase);
            respon.put("Message", "Actualizado");
            return new ResponseEntity<>(respon, HttpStatus.OK);
        }
    }
    
    public ResponseEntity<?> RealizarServiceClase(ClaseDTO claseDTO){
        Disciplinas disciplina = repositorydisc.findDisciplinaById(claseDTO.getDisciplina());
        Trainers trainer = repositorytrai.findTrainerById(claseDTO.getTrainer());
        Salon salon = repositorysal.findSalonById(claseDTO.getSalon());       
        Map<String, Object> respon = new HashMap<>();

        Clase clase = new Clase();
        clase.setDisciplina(disciplina);
        clase.setTrainers(trainer);
        clase.setSalon(salon);
        clase.setCuposmax(claseDTO.getCuposmax());
        clase.setHoraIni(claseDTO.getHoraIni());
        clase.setHoraFin(claseDTO.getHoraFin());
        repository.save(clase);

        respon.put("Message", "Realizado correctamente");
        return new ResponseEntity<>(respon ,HttpStatus.OK);
    }
    
    public List<Clase> getClasesByIdDisciplina(Long id){
        return repository.findByDisciplina_Id(id);
    }

}

