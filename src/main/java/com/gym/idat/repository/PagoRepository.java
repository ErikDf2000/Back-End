package com.gym.idat.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Pago;


public interface PagoRepository extends JpaRepository<Pago, Long> {
   // List<Pago> findByPlan_id(int id);


    //List<Pago> findByEstadoAndplanIdAndMensualidad_FechaFinalBefore(Boolean estado , int id , LocalDate mes);
}
