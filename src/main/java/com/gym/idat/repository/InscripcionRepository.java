package com.gym.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Inscripcion;



public interface InscripcionRepository extends JpaRepository<Inscripcion, Long>{

	//TABLA CLIENTE
	//Cliente findByNombre(String nombre);
}
