package com.admin.klepApi.controllers;

import com.admin.klepApi.domain.HealthPlan;
import com.admin.klepApi.dto.HealthPlanUpdateDTO;
import com.admin.klepApi.dto.ProfessionalUpdateDTO;
import com.admin.klepApi.services.HealthPlanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/health-plan")
public class HealthPlanController {

    @Autowired
    private HealthPlanService healthPlanService;

    @GetMapping
    public ResponseEntity<List<HealthPlan>> findAllHealthPlans(){
        List<HealthPlan> healthPlans = healthPlanService.findAllHealthPlan();

        return ResponseEntity.ok().body(healthPlans);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<HealthPlan> findById(@PathVariable Integer id){
        HealthPlan healthPlan = healthPlanService.findById(id);

        return ResponseEntity.ok().body(healthPlan);
    }

    @PostMapping
    public ResponseEntity<HealthPlan> insert(@Valid @RequestBody HealthPlan healthPlan){
        HealthPlan newHealthPlan = healthPlanService.insert(healthPlan);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newHealthPlan.getId())
                .toUri();
        return ResponseEntity.created(uri).body(newHealthPlan);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody @Valid HealthPlanUpdateDTO healthPlanUpdateDTO){
        healthPlanService.update(healthPlanUpdateDTO, id);

        return ResponseEntity.ok().body(null);
    }
}
