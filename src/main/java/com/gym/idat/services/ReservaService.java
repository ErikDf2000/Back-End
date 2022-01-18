package com.gym.idat.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.gym.idat.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gym.idat.Utils.other.ReservaDTO;
import com.gym.idat.repository.ClienteRepository;
import com.gym.idat.repository.PlanpagoRepository;
import com.gym.idat.repository.ReservaRepository;


@Service
public class ReservaService {


	 	@Autowired
	    private ReservaRepository repository;
	 
	 
	 	@Autowired
	    private ClienteRepository repositorycli;
	    @Autowired
	    private PlanpagoRepository repositoryplan;

		@Autowired
		private MensualidadService serviceMensualidad;

		@Autowired
		private PagoService pagoService;

		public List<Reserva> listado() {
		return repository.findAll();
	}


	public Reserva fidnByIDCliente(Long id) {
		return repository.findAllByClienteId(id);
	}


	public ResponseEntity<?> updateReserva(ReservaDTO reservaDTO) {
	        Map<String, Object> respon = new HashMap<>();
	        Cliente cliente = repositorycli.findClienteById(reservaDTO.getCliente());
	        Planpago planpago = repositoryplan.findPlanpagoById(reservaDTO.getPlanpago());
	        Reserva reserva = repository.findReservaById(reservaDTO.getId());

	        {
	            reserva.setCliente(cliente);
	            reserva.setPlanpago(planpago);
	            reserva.setFecha(reservaDTO.getFecha());
	            reserva.setEstado(reservaDTO.getEstado());

	            repository.save(reserva);
	            respon.put("Message", "Actualizado");
	            return new ResponseEntity<>(respon, HttpStatus.OK);
	        }
	    }

	    public ResponseEntity<?> RegistrarReserva(ReservaDTO reservaDTO) {
	        Cliente cliente = repositorycli.findClienteById(reservaDTO.getCliente());
	        Planpago planpago = repositoryplan.findPlanpagoById(reservaDTO.getPlanpago());
	        Map<String, Object> respon = new HashMap<>();

	        Reserva reserva = new Reserva();
	        reserva.setCliente(cliente);
	        reserva.setPlanpago(planpago);
	        reserva.setFecha(reservaDTO.getFecha());
	        reserva.setEstado(reservaDTO.getEstado());
	        repository.save(reserva);


			List<Mensualidad> mensualidades = serviceMensualidad.getAll();




			for (Mensualidad mensualidad : mensualidades){
				Pago mensualidadPago = new Pago();
				mensualidadPago.setMensualidad(mensualidad);
				mensualidadPago.setReserva(reserva);
				pagoService.save(mensualidadPago);
			}










	        respon.put("Message", "Realizado exitosamente");
	        return new ResponseEntity<>(respon, HttpStatus.OK);
	    }
	    
	    
	    
	    public List<Reserva> FiltroReserva(String n, String a){
	    	 return repository.findAllByClienteNombreContainsOrClienteApellidoContains(n, a);
	    }



	    
}
