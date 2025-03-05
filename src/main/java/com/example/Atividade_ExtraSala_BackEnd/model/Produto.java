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
    private Integer id;
    private String nome;
    private String categoria;
    private Double preco;
    private Integer quantidade_estoque;
    private Boolean status;

}
