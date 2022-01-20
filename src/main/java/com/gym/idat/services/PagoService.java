package com.gym.idat.services;

import com.gym.idat.model.Pago;
import com.gym.idat.model.Reserva;
import com.gym.idat.repository.PagoRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PagoService {

    @Autowired
    private PagoRepository repository;

    public Pago save(Pago pago) {
    	pago.setEstado("Pendiente");
        return repository.save(pago);
    }

    public List<Pago> getPago() {
        return repository.findAll();
    }

    public Pago getPagoById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Pago> getPagoByIdCliente(Long id) {
        return repository.findByReservaCliente_Id(id);
    }


    public String RealizarPago(Long id){



        Pago newPago =   this.getPagoById(id);
        newPago.setEstado("Pagado");


        return "Pago Realizado";

    }

    public List<Pago> custom(Long  id , LocalDate mes ){
        return repository.findByEstadoAndReserva_Cliente_IdAndMensualidad_FechaFinalBefore( "Pendiente" , id , mes  );
    }
}
