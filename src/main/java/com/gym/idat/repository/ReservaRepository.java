package com.gym.idat.repository;

import com.gym.idat.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva,Long> {

    public Reserva findReservaById(Long id);

}