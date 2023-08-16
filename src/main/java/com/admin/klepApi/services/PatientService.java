package com.admin.klepApi.services;

import com.admin.klepApi.domain.Patient;
import com.admin.klepApi.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Patient create(Patient patient) {
        return patientRepository.save(patient);
    }

    public void delete(Integer patientId) {
        patientRepository.deleteById(patientId);
    }
}
