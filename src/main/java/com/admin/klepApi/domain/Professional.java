package com.admin.klepApi.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Professional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf_cnpj;

    @ManyToMany(mappedBy = "professionals")
    List<HealthPlan> healthPlans;


    public Professional() {
    }

    public Professional(String name, String cpf_cnpj, List<HealthPlan> healthPlans) {
        this.name = name;
        this.cpf_cnpj = cpf_cnpj;
        this.healthPlans = healthPlans;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public List<HealthPlan> getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(List<HealthPlan> healthPlans) {
        this.healthPlans = healthPlans;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
