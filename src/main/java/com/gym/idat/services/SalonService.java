package com.gym.idat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Pago;
import com.gym.idat.model.Salon;
import com.gym.idat.repository.SalonRepository;

@Service
public class SalonService {

	 @Autowired
	    private SalonRepository repository;
	 
	 public Salon save(Salon pago) {
	        return repository.save(pago);
	    }
	 
	 public Salon getSalonById(Long id) {
	        return repository.findSalonById(id);
	    }
}
