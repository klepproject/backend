package com.admin.klepApi.controllers;

import com.admin.klepApi.domain.Patient;
import com.admin.klepApi.services.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Patient> findById(@PathVariable Integer patientId) {
        Optional<Patient> patient = Optional.ofNullable(patientService.findById(patientId)); //to check this line

        return patient.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Patient create(@Valid @RequestBody Patient patient) {
        return patientService.create(patient);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> delete(@PathVariable Integer patientId) {
        patientService.delete(patientId);
        return ResponseEntity.noContent().build();
    }

}
