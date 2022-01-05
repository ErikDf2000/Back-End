package com.gym.idat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gym.idat.model.Salon;
import com.gym.idat.repository.SalonRepository;

@Service
public class SalonService {

	 @Autowired
	    private SalonRepository repository;
	 
	 public Salon save(Salon salon) {
	        return repository.save(salon);
	    }
	 
	 public Salon getSalonById(Long id) {
	        return repository.findSalonById(id);
	    }
	 public List<Salon> listado() {
		    return repository.findAll();
		}
}
