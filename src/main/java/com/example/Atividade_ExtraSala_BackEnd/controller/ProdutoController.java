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
        if (produto.getQuantidade_estoque() > 0){
            produto.setStatus(true);
        } else {
            produto.setStatus(false);
        }
        banco.insertProduto(produto);
    }

    public boolean atualizarProduto(Produto produto) {
        if (produto.getQuantidade_estoque() > 0){
            produto.setStatus(true);
        } else {
            produto.setStatus(false);
        }
        return banco.updateProduto(produto);
    }

    public boolean deletarProduto(int id) {
        return banco.deleteProduto(id);
    }
}
