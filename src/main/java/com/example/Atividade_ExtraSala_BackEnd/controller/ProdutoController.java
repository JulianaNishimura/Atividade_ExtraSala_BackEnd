package com.example.Atividade_ExtraSala_BackEnd.controller;

import com.example.Atividade_ExtraSala_BackEnd.database.BancoProduto;
import com.example.Atividade_ExtraSala_BackEnd.model.Produto;
import java.util.List;

public class ProdutoController {
    BancoProduto banco = BancoProduto.getInstance();

    public List<Produto> listarProduto() {
        return banco.findAllProduto();
    }

    public void postarProduto(Produto produto) {
        banco.insertProduto(produto);
    }

    public boolean atualizarProduto(Produto produto) {
        return banco.updateProduto(produto);
    }

    public boolean deletarProduto(int id) {
        return banco.deleteProduto(id);
    }
}
