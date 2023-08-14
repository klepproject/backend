package com.admin.klepApi.controllers;

import com.admin.klepApi.domain.Patient;
import com.admin.klepApi.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> findAll(){
        List<Patient> patientList = patientService.findAll();

        return ResponseEntity.ok().body(patientList);
    }

    @GetMapping
    public ResponseEntity<Patient> findById(@PathVariable Long patientId) {
        Optional<Patient> patient = patientService.findById(patientId);

        return patient.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Patient> findByPhone() {

    }

}
