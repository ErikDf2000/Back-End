package com.gym.idat.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gym.idat.Utils.other.TrainerDTO;
import com.gym.idat.model.Disciplinas;
import com.gym.idat.model.Trainers;
import com.gym.idat.repository.DisciplinaRepository;
import com.gym.idat.repository.TrainerRepository;


@Service
public class TrainerService {
	
	@Autowired
    private TrainerRepository repository;

	 @Autowired
	    private DisciplinaRepository repositorydisc;
	 
	 
 	public Trainers save(Trainers trainer) {
        return repository.save(trainer);
    }

 	

    public List<Trainers> getTrainers() {
        return repository.findAll();
    }

    public Trainers getTrainerById(Long id) {
        return repository.findTrainerById(id);
    }

 
    
    public List<Trainers> findByNombreOrApellido(String n, String a){
        return repository.findByNombreContainsOrApellidoContains(n, a); 
    }
    /*public List<Trainers> findByNombreAndApellido(String n, String a){
        return repository.findByNombreContainsAndApellidoContains(n, a); 
    }*/


   /* public Trainers UpdateTrainer(Trainers trainer) {
    	
    	Disciplinas disciplina = repositorydisc.findDisciplinaById(trainer.getDisciplinas());
    	Trainers existingTrainer = repository.findTrainerById(trainer.getId());
        existingTrainer.setNombre(trainer.getNombre());//
        existingTrainer.setApellido(trainer.getApellido());//
        existingTrainer.setFechaNac(trainer.getFechaNac());//
        existingTrainer.setTelefono(trainer.getTelefono());//
        existingTrainer.setDescripcion(trainer.getDescripcion());//
        existingTrainer.setDni(trainer.getDni());//
        existingTrainer.setGenero(trainer.getGenero());//
        existingTrainer.setPeso(trainer.getPeso());//
        existingTrainer.setAltura(trainer.getAltura());//
        existingTrainer.setFoto(trainer.getFoto());//
        existingTrainer.setDisciplinas(disciplina);//
        
        return repository.save(existingTrainer);
    }*/
    public ResponseEntity<?> UpdateTrainer(TrainerDTO trainerDTO){
        Map<String, Object> respon = new HashMap<>();
        Disciplinas disciplina = repositorydisc.findDisciplinaById(trainerDTO.getDisciplinas());
        Trainers existingTrainer = repository.findTrainerById(trainerDTO.getId());
        
       // existingTrainer.setFechaNac(trainerDTO.getFechaNac());//
        existingTrainer.setTelefono(trainerDTO.getTelefono());//
        existingTrainer.setDescripcion(trainerDTO.getDescripcion());//
       // existingTrainer.setDni(trainerDTO.getDni());//
        existingTrainer.setGenero(trainerDTO.getGenero());//
        existingTrainer.setPeso(trainerDTO.getPeso());//
        existingTrainer.setAltura(trainerDTO.getAltura());//
       // existingTrainer.setFoto(trainerDTO.getFoto());//
        existingTrainer.setDisciplinas(disciplina);//
        
       if(trainerDTO.getFoto().isEmpty()){
            repository.save(existingTrainer);
            respon.put("Message", "Guardado");
        }else {
            if(!trainerDTO.getFoto().isEmpty()){
            	existingTrainer.setFoto(trainerDTO.getFoto());
                repository.save(existingTrainer);
                respon.put("Message", "Guardado");
            }
        }
        return new ResponseEntity<>(respon, HttpStatus.OK);
    }

}
