package com.example.Atividade_ExtraSala_BackEnd.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    private Fornecedor fornecedor;
    private Double valor;
    private ZonedDateTime data_compra;

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public ZonedDateTime getData_compra() {
        return data_compra;
    }

    public void setData_compra(ZonedDateTime data_compra) {
        this.data_compra = data_compra;
    }
}
