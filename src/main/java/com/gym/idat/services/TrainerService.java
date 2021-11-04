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


 	public Trainers save(Trainers trainer) {
        return repository.save(trainer);
    }

 	

    public List<Trainers> getTrainers() {
        return repository.findAll();
    }

    public Trainers getTrainerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Trainers getTrainerByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }
    
    public List<Trainers> findByNombreOrApellido(String n, String a){
        return repository.findByNombreContainsOrApellidoContains(n, a);
    

   
    }

    public Trainers updateTrainer(Trainers trainer) {
    	Trainers existingTrainer = repository.findById(trainer.getId()).orElse(null);
        existingTrainer.setNombre(trainer.getNombre());
        existingTrainer.setApellido(trainer.getApellido());
        existingTrainer.setFechaNac(trainer.getFechaNac());
        existingTrainer.setTelefono(trainer.getTelefono());
        existingTrainer.setDescripcion(trainer.getDescripcion());
        existingTrainer.setDni(trainer.getDni());
        existingTrainer.setGenero(trainer.getGenero());
        existingTrainer.setPeso(trainer.getPeso());
        existingTrainer.setAltura(trainer.getAltura());
        existingTrainer.setFoto(trainer.getFoto());
        
        return repository.save(existingTrainer);
    }

}
