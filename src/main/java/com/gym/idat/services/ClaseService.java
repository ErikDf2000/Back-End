package com.gym.idat.services;

import com.gym.idat.model.Clase;
import com.gym.idat.repository.ClaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaseService {

    @Autowired
    private ClaseRepository repository;

    public List<Clase> listado(){
        return repository.findAll();
    }

    public String  save(Clase clase){
        repository.save(clase);
        return "Registro Exitoso";
    }
    public String deleteClase(int id) {
        repository.deleteById(id);
        return "Clase removida!! " + id;
    }

}
