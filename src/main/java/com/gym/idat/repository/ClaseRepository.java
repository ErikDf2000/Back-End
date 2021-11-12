package com.gym.idat.repository;

import com.gym.idat.model.Clase;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaseRepository extends JpaRepository<Clase, Long> {
	

   // public List<Clase> findAllByTrainerId(Long id);
}
