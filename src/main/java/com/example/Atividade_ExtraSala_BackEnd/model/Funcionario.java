package com.example.Atividade_ExtraSala_BackEnd.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {
    private String nome;
    private String cpf;
    private Double comissao_por_venda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getComissao_por_venda() {
        return comissao_por_venda;
    }

    public void setComissao_por_venda(Double comissao_por_venda) {
        this.comissao_por_venda = comissao_por_venda;
    }
}
