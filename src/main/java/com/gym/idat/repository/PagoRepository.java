package com.gym.idat.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym.idat.model.Pago;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PagoRepository extends JpaRepository<Pago, Integer> {
    List<Pago> findByPlan_id(Integer id);


    List<Pago> findByEstadoAndplanPlanIdAndMensualidad_FechaFinalBefore(Boolean estado , Integer id , LocalDate mes);
}
