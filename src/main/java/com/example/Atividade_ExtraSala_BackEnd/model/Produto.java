package com.example.Atividade_ExtraSala_BackEnd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private String nome;
    private String categoria;
    private Double preco;
    private Estoque quantidade_estoque;
    private Boolean status;
}
