package com.gym.idat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Reserva;



public interface ReservaRepository extends JpaRepository<Reserva, Long>{
	
	public  Reserva  findReservaById ( Long  id );
	
	public List<Reserva> findAllByClienteNombreContainsOrClienteApellidoContains(String n,String a);
	public List<Reserva> findAllByClienteId(Long id);
}

