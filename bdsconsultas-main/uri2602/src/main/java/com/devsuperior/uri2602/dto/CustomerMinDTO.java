package com.devsuperior.uri2602.dto;

import com.devsuperior.uri2602.projections.CustomerMinProjection;

public class CustomerMinDTO {

    private String nome;

    public CustomerMinDTO() {
    }

    public CustomerMinDTO(String nome) {
        this.nome = nome;
    }

    public CustomerMinDTO(CustomerMinProjection projection) {
        nome = projection.getNome();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
