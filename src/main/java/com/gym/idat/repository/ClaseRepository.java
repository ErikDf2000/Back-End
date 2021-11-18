package com.gym.idat.repository;

import com.gym.idat.model.Clase;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaseRepository extends JpaRepository<Clase, Long> {
	
	public Clase findClaseById(Long id);
   // public Clase findAllById(Long id);
}
