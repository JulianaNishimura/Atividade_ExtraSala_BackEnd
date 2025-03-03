package com.example.Atividade_ExtraSala_BackEnd.controller;

import com.example.Atividade_ExtraSala_BackEnd.database.BancoFornecedor;
import com.example.Atividade_ExtraSala_BackEnd.model.Fornecedor;
import java.util.List;

public class FornecedorController {
    BancoFornecedor banco = BancoFornecedor.getInstance();

    public List<Fornecedor> listarFornecedor() {
        return banco.findAllFornecedor();
    }

    public void postarFornecedor(Fornecedor fornecedor) {
        banco.insertFornecedor(fornecedor);
    }

    public boolean atualizarFornecedor(Fornecedor fornecedor) {
        return banco.updateFornecedor(fornecedor);
    }

    public boolean deletarFornecedor(int id) {
        return banco.deleteFornecedor(id);
    }
}
