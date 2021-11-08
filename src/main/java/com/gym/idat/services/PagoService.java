package com.gym.idat.services;

import com.gym.idat.model.Disciplinas;
import com.gym.idat.model.Pago;
import com.gym.idat.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class PagoService {

    @Autowired
    private PagoRepository repository;

    public Pago save(Pago pago) {
        return repository.save(pago);
    }

    public List<Pago> getPago() {
        return repository.findAll();
    }

    public Pago getPagoById(int id) {
        return repository.findById(id).orElse(null);
    }

    /*public List<Pago> getPagosByIdAlumno(int id){
        return repository.findByPlan_id(id);
    }*/

    /*public List<Pago> custom(int  id , LocalDate mes ){
        return repository.findByEstadoAndplanIdAndMensualidad_FechaFinalBefore( false , id , mes  );
    }*/





}
