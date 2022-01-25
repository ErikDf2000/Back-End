package com.gym.idat.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.gym.idat.model.Pago;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public interface PagoRepository extends JpaRepository<Pago, Long> {
   // List<Pago> findByPlan_id(int id);

    List<Pago> findByReserva_Cliente_Id(Long id);

    List<Pago> findByReserva_Cliente_IdAndMensualidad_FechaFinalBefore(Long id , LocalDate mes);


}
