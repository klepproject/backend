package com.admin.klepApi.dto;

public class ProfessionalUpdateDTO {
    private String name;
    private String cpf_cnpj;

    public ProfessionalUpdateDTO() {
    }

    public ProfessionalUpdateDTO(String name, String cpf_cnpj) {
        this.name = name;
        this.cpf_cnpj = cpf_cnpj;
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
}
