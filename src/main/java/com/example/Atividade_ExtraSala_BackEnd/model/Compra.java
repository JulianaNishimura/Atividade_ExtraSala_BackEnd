package com.example.Atividade_ExtraSala_BackEnd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    private Integer id;
    private Fornecedor fornecedor;
    private Double valor;
    private ZonedDateTime data_compra;

}
