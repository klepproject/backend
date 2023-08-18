package com.admin.klepApi.services;

import com.admin.klepApi.repository.HealthPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthPlanService {

    @Autowired
    private HealthPlanRepository repository;
}
