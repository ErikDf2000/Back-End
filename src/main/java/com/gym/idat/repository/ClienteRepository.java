package com.gym.idat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Cliente;


//uso de Spring Data

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	List<Cliente> findByNombreContainsOrApellidoContains(String n, String a);
    Cliente findByNombre(String nombre);
}
