package com.gym.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym.idat.model.Salon;


public interface SalonRepository extends JpaRepository<Salon, Long> {
	
	public Salon findSalonById(Long id);

}
