package com.admin.klepApi.domain;

public class Paciente {
    private Long id;
    private String nome;
    private String celular;
    private String email;
    private String senha;
    private String endereco;

    public Paciente() {

    }

    public Paciente(Long id, String nome, String celular, String email, String senha, String endereco) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
