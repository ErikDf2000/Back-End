package com.gym.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long>{
	public  Reserva  findReservaById ( Long  id );
}
