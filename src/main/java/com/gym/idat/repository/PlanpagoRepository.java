package com.gym.idat.repository;

import com.gym.idat.model.Disciplinas;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Planpago;


public interface PlanpagoRepository extends JpaRepository<Planpago, Long> {

    public Planpago findPlanpagoById (Long id);
}
