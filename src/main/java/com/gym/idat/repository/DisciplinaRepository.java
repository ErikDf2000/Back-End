package com.gym.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Disciplinas;



public interface DisciplinaRepository extends JpaRepository<Disciplinas, Long> {

	Disciplinas findByNombre(String nombre);
	public Disciplinas findDisciplinaById(Long id);
}
