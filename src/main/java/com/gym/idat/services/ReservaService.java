package com.gym.idat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gym.idat.model.Reserva;
import com.gym.idat.model.Salon;
import com.gym.idat.repository.ReservaRepository;

@Service
public class ReservaService {


	 @Autowired
	    private ReservaRepository repository;
	 
	 
	 public Reserva save(Reserva reserva) {
	        return repository.save(reserva);
	    }
	 
	 public Reserva getById(Long id) {
	        return repository.findById(id).orElse(null); 	
	    }
}
