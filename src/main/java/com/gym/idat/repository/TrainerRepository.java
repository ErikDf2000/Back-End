package com.gym.idat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Trainers;



public interface TrainerRepository extends JpaRepository<Trainers, Long> {

	List<Trainers> findByNombreContainsOrApellidoContains(String n, String a);
	public Trainers findTrainerById(Long id);
}
