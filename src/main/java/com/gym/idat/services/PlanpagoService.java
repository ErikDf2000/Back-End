package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Planpago;
import com.gym.idat.repository.PlanpagoRepository;

@Service
public class PlanpagoService {
	
	@Autowired
    private PlanpagoRepository repository;

public String save(Planpago  planpago) {
    repository.save(planpago);
    return "Registro Exitoso";
}

public List<Planpago> listado() {
    return repository.findAll();
}

public Planpago getPlanpagoById(Long id) {
    return repository.findPlanpagoById(id);
}

public Planpago updatePlanpago(Planpago planpago) {
    Planpago existingPlanpago = repository.findById(planpago.getId()).orElse(null);
    existingPlanpago.setInicio(planpago.getInicio());
    existingPlanpago.setFinn(planpago.getFinn());
    existingPlanpago.setEstado(planpago.isEstado());
    existingPlanpago.setCosto(planpago.getCosto());
    existingPlanpago.setDisciplinas(planpago.getDisciplinas());
       return repository.save(existingPlanpago);
}

}
