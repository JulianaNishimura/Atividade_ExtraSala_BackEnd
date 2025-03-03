package com.example.Atividade_ExtraSala_BackEnd.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Venda {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();
    private Double valor_final_venda;
    private ZonedDateTime data_venda;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Double getValor_final_venda() {
        return valor_final_venda;
    }

    public void setValor_final_venda(Double valor_final_venda) {
        this.valor_final_venda = valor_final_venda;
    }

    public ZonedDateTime getData_venda() {
        return data_venda;
    }

    public void setData_venda(ZonedDateTime data_venda) {
        this.data_venda = data_venda;
    }
}
