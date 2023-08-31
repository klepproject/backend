package com.admin.klepApi.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class HealthPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "healthPlan")
    private List<Patient> patients;

    @ManyToMany
    @JoinTable(
        name = "health_plan_professional",
        joinColumns = @JoinColumn(name = "health_plan_id"),
        inverseJoinColumns = @JoinColumn(name ="profissional_id")
    )
    private List<Professional> professionals;


    public HealthPlan() {
    }

    public HealthPlan(String name, List<Patient> patients, List<Professional> professionals) {
        this.name = name;
        this.patients = patients;
        this.professionals = professionals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Professional> getProfessionals() {
        return professionals;
    }

    public void setProfessionals(List<Professional> professionals) {
        this.professionals = professionals;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
