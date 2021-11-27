package com.gym.idat.controller;

import com.gym.idat.model.Planpago;
import com.gym.idat.services.PlanpagoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/planpago")
public class PlanpagoController {
	
	@Autowired
    private PlanpagoService service;


    @GetMapping
    public List<Planpago> listado(){
      return service.listado();
    }

    @PostMapping
    public String save(@RequestBody Planpago planpago){
        return service.save(planpago);
    }

    @PutMapping
    public Planpago updatePlanpago(@RequestBody Planpago planpago) {
    	return service.updatePlanpago(planpago);
    	
    
    }
}
