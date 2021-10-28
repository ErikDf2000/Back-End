package com.gym.idat.services;

import com.gym.idat.model.Mensualidad;
import com.gym.idat.repository.MensualidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class MensualidadService {

    @Autowired
    private MensualidadRepository repository;

    public List<Mensualidad> getAll(){
        return repository.findAll();
    }

    public Boolean getById(Integer id){
        return repository.existsById(id);
    }

    public String create(Mensualidad mensualidad){
        repository.save(mensualidad);
        return "Mensualidad Creada.";
    }

    public String update(Mensualidad mensualidad,Integer id){
        Mensualidad mensualidadUpd = repository.getById(id);

        mensualidadUpd.setFechaInicio(mensualidad.getFechaInicio());
        mensualidadUpd.setFechaFinal(mensualidad.getFechaFinal());
        mensualidadUpd.setMes(mensualidad.getMes());
        mensualidadUpd.setMonto(mensualidad.getMonto());

        repository.save(mensualidadUpd);
        return "Mensualidad Actualizada.";
    }

//    public List<Mensualidad> custom(Date fechaIni , Date fechaFin){
//        return repository.findAllByFechaInicioBetweenAndFechaFinal(fechaIni, fechaFin);
//    }
}
