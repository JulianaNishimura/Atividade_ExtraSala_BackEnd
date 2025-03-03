package com.example.Atividade_ExtraSala_BackEnd.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private String nome;
    private String categoria;
    private Double preco;
    private Estoque quantidade_estoque;
    private Boolean status;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Estoque getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(Estoque quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
