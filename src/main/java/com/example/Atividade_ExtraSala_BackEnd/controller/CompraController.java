package com.example.Atividade_ExtraSala_BackEnd.controller;

import com.example.Atividade_ExtraSala_BackEnd.database.BancoCompra;
import com.example.Atividade_ExtraSala_BackEnd.model.Compra;
import java.util.List;

public class CompraController {
    BancoCompra banco = BancoCompra.getInstance();

    public List<Compra> listarCompra() {
        return banco.findAllCompra();
    }

    public void postarCompra(Compra compra) {
        banco.insertCompra(compra);
    }

    public boolean atualizarCompra(Compra compra) {
        return banco.updateCompra(compra);
    }

    public boolean deletarCompra(int id) {
        return banco.deleteCompra(id);
    }
}
