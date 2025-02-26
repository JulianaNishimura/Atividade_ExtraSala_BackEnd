package com.example.Atividade_ExtraSala_BackEnd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Venda {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();
    private Double valor_final_venda;
    private ZonedDateTime data_venda;
}
