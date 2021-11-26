package com.gym.idat.services;

import com.gym.idat.model.Planpago;
import com.gym.idat.repository.PlanpagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanpagoService {


    @Autowired
    private PlanpagoRepository repositoryplan;


    public List<Planpago> listado() {
        return repositoryplan.findAll();
    }


    public Planpago updatePlanpago(Planpago planpago) {
        Planpago existingPlanpago = repositoryplan.findById(planpago.getId()).orElse(null);
        existingPlanpago.setInicio(planpago.getInicio());
        existingPlanpago.setFinn(planpago.getFinn());
        existingPlanpago.setEstado(planpago.isEstado());
        return repositoryplan.save(existingPlanpago);
    }


    public String save(Planpago planpago) {
        repositoryplan.save(planpago);
        return "Registro Exitoso";
    }
}



