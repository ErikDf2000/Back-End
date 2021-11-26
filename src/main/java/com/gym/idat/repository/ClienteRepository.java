package com.gym.idat.repository;

import java.util.List;

import com.gym.idat.model.Planpago;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Cliente;


//uso de Spring Data

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	List<Cliente> findByNombreContainsOrApellidoContains(String n, String a);
    Cliente findByNombre(String nombre);
    public  Cliente findClienteById(Long id);
}
