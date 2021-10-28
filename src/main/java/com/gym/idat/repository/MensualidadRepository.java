package com.gym.idat.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym.idat.model.Mensualidad;



@Repository
public interface MensualidadRepository extends JpaRepository<Mensualidad, Integer> {


}
