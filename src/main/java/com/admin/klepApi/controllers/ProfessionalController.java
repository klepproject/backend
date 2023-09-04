package com.admin.klepApi.controllers;

import com.admin.klepApi.domain.Professional;
import com.admin.klepApi.dto.ProfessionalUpdateDTO;
import com.admin.klepApi.services.ProfessionalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/professional")
public class ProfessionalController {

    @Autowired
    ProfessionalService professionalService;

    @GetMapping
    public ResponseEntity<List<Professional>> findAllProfessionals(){
        List<Professional> professionals = professionalService.findAllProfessionals();

        return ResponseEntity.ok().body(professionals);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Professional> findById(@PathVariable Integer id){
        Professional professional = professionalService.findById(id);

        return ResponseEntity.ok().body(professional);
    }

    @PostMapping
    public ResponseEntity<Professional> insert(@RequestBody @Valid Professional professional){
        professionalService.insert(professional);

        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(professional.getId())
                .toUri();
        return ResponseEntity.created(uri).body(professional);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody @Valid ProfessionalUpdateDTO professional){
        professionalService.update(professional, id);

        return ResponseEntity.ok().body(null);
    }
}
