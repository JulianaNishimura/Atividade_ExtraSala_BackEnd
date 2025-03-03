package com.example.Atividade_ExtraSala_BackEnd.controller;

import com.example.Atividade_ExtraSala_BackEnd.database.BancoVenda;
import com.example.Atividade_ExtraSala_BackEnd.model.Venda;
import java.util.List;

public class VendaController {
    BancoVenda banco = BancoVenda.getInstance();

    public List<Venda> listarVenda() {
        return banco.findAllVenda();
    }

    public void postarVenda(Venda venda) {
        banco.insertVenda(venda);
    }

    public boolean atualizarVenda(Venda venda) {
        return banco.updateVenda(venda);
    }

    public boolean deletarVenda(int id) {
        return banco.deleteVenda(id);
    }
}
