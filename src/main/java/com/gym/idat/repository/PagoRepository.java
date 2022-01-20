package com.gym.idat.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Pago;

import java.time.LocalDateTime;
import java.util.List;


public interface PagoRepository extends JpaRepository<Pago, Long> {
   // List<Pago> findByPlan_id(int id);

    List<Pago> findByReservaCliente_Id(Long id);

    List<Pago> findByEstadoAndReserva_Cliente_IdAndMensualidad_FechaFinalBefore(String estado,Long id , LocalDateTime mes);

    //List<Pago> findByEstadoAndplanIdAndMensualidad_FechaFinalBefore(Boolean estado , int id , LocalDate mes);
}
