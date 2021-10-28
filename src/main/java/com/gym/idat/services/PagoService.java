package com.gym.idat.services;

import com.gym.idat.model.Pago;
import com.gym.idat.repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class PagoService {

    @Autowired
    private PagoRepository repository;

    public List<Pago> getAll(){
        return repository.findAll();
    }

    public Boolean getById(Integer id){
        return repository.existsById(id);
    }

    public String create(Pago pago){
        repository.save(pago);
        return "Pago Creado.";
    }

    public String update(Pago pago, Integer id){
        Pago pagoUpd = repository.getById(id);

        pagoUpd.setFechaPago(pago.getFechaPago());
        pagoUpd.setDescripcion(pago.getDescripcion());
        pagoUpd.setEstado(pago.getEstado());
        pagoUpd.setMensualidad(pago.getMensualidad());
        pagoUpd.setPlanpago(pago.getPlanpago());

        repository.save(pagoUpd);
        return "Pago Actualizado.";
    }

    public String pagar(Pago pago, Integer id){
        LocalDate date = LocalDate.now();
        Pago pagar = repository.getById(id);

        pagar.setDescripcion(pago.getDescripcion());
        pagar.setFechaPago(date);
        pagar.setEstado(true);
        repository.save(pagar);
        return "Pago Realizado del mes de "+pagar.getMensualidad().getMes();
    }

    public List<Pago> getPagosByIdAlumno(Integer id){
        return repository.findByPlan_id(id);
    }

    public List<Pago> custom(Integer  id , LocalDate mes ){
        return repository.findByEstadoAndplanPlanIdAndMensualidad_FechaFinalBefore( false , id , mes  );
    }





}
