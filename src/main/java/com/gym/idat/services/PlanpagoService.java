package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.gym.idat.model.Planpago;
import com.gym.idat.repository.PlanpagoRepository;

public class PlanpagoService {
	
	@Autowired
    private PlanpagoRepository repository;

public Planpago save(Planpago disciplina) {
    return repository.save(disciplina);
}

public List<Planpago> getPlanpago() {
    return repository.findAll();
}

public Planpago getPlanpagoById(Long id) {
    return repository.findPlanpagoById(id);
}

public Planpago updatePlanpago (Planpago  disciplinas ) {
	Planpago existingDisciplinas  = repository.findById(disciplinas.getId()).orElse(null);
	existingDisciplinas.setNombre(disciplinas.getNombre());
	existingDisciplinas.setEstado(true);
	existingDisciplinas.setInicio(disciplinas.getInicio());
    existingDisciplinas.setFinn(disciplinas.getFinn());
    return repository.save(existingDisciplinas);
}

}
