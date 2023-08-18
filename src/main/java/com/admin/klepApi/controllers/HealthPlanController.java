package com.admin.klepApi.controllers;

import com.admin.klepApi.services.HealthPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health-plan")
public class HealthPlanController {

    @Autowired
    private HealthPlanService service;
}
