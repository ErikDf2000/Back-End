package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Disciplinas;
import com.gym.idat.repository.DisciplinaRepository;

@Service
public class DisciplinaService {
	 
	@Autowired
	    private DisciplinaRepository repository;
	
	public Disciplinas save(Disciplinas disciplina) {
        return repository.save(disciplina);
    }

    public List<Disciplinas> getDisciplinas() {
        return repository.findAll();
    }

    public Disciplinas getDisciplinaById(Long id) {
        return repository.findDisciplinaById(id);
    }

    public Disciplinas getDisciplinaByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }
    
    public Disciplinas updateDisciplinas (Disciplinas  disciplinas ) {
    	Disciplinas existingDisciplinas  = repository.findById(disciplinas.getId()).orElse(null);
    	existingDisciplinas.setNombre(disciplinas.getNombre());
    	existingDisciplinas.setDescripcion(disciplinas.getDescripcion());
    	existingDisciplinas.setImagen(disciplinas.getImagen());
        return repository.save(existingDisciplinas);
    }


}
