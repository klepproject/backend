package com.admin.klepApi.services;

import com.admin.klepApi.domain.HealthPlan;
import com.admin.klepApi.repository.HealthPlanRepository;
import com.admin.klepApi.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthPlanService {

    @Autowired
    private HealthPlanRepository healthPlanRepository;

    public List<HealthPlan> findAllHealthPlan(){
        return healthPlanRepository.findAll();
    }

    public HealthPlan insert(HealthPlan healthPlan){
        healthPlanRepository.save(healthPlan);

        return healthPlan;
    }

    public HealthPlan findById(Integer id){
        return healthPlanRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("HealthPlan not found! Id: " + id));
    }
}
