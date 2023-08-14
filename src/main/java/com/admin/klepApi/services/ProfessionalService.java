package com.admin.klepApi.services;

import com.admin.klepApi.domain.Professional;
import com.admin.klepApi.repository.ProfessionalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    @Autowired
    ProfessionalRepository professionalRepository;

    public void insert(Professional professional){
        professionalRepository.save(professional);
    }

    public List<Professional> findAllProfessionals(){
        return professionalRepository.findAll();
    }
}
