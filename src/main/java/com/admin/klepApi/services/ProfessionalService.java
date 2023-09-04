package com.admin.klepApi.services;

import com.admin.klepApi.domain.Professional;
import com.admin.klepApi.dto.ProfessionalUpdateDTO;
import com.admin.klepApi.repository.ProfessionalRepository;
import com.admin.klepApi.services.exception.ObjectNotFoundException;
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

    public Professional findById(Integer id) {
        return professionalRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Professional not found! Id "+ id));
    }

    public void update(ProfessionalUpdateDTO professional, Integer id) {
        Professional oldProfessional = findById(id);

        oldProfessional.setCpf_cnpj(professional.getCpf_cnpj());
        oldProfessional.setName(professional.getName());

        professionalRepository.save(oldProfessional);
    }
}
