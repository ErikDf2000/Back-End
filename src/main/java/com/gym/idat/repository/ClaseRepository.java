package com.gym.idat.repository;

import com.gym.idat.model.Clase;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaseRepository extends JpaRepository<Clase, Long> {
	  List<Clase> findByDisciplina_Id(Long id);
	public Clase findClaseById(Long id);
   // public Clase findAllById(Long id);
}
