package com.example.Atividade_ExtraSala_BackEnd.controller;

import com.example.Atividade_ExtraSala_BackEnd.database.BancoCliente;
import com.example.Atividade_ExtraSala_BackEnd.database.BancoProduto;
import com.example.Atividade_ExtraSala_BackEnd.database.BancoVenda;
import com.example.Atividade_ExtraSala_BackEnd.model.Cliente;
import com.example.Atividade_ExtraSala_BackEnd.model.Produto;
import com.example.Atividade_ExtraSala_BackEnd.model.Venda;
import java.util.List;

public class VendaController {
    BancoVenda bancoVenda = BancoVenda.getInstance();
    BancoCliente bancoCliente = BancoCliente.getInstance();
    BancoProduto bancoProduto = BancoProduto.getInstance();

    public List<Venda> listarVenda() {
        return bancoVenda.findAllVenda();
    }

    public boolean postarVenda(Venda venda) {
        List<Produto> listaProdutoVendido = venda.getProdutos();
        double valor = 0.0;
        int quantidadeatualizada;
        Produto produtonobanco;

        if(bancoCliente.findOneCliente(venda.getCliente().getId()) == null){
            return false;
        }

        for(Produto p : listaProdutoVendido){
            if(bancoProduto.findOneProduto(p.getId())==null){
                return false;
            } else {
                produtonobanco = bancoProduto.findOneProduto(p.getId());
                if (produtonobanco.getQuantidade_estoque().getQuantidade() < p.getQuantidade_estoque().getQuantidade()) {
                    return false;
                }

                valor = valor + (p.getPreco() * p.getQuantidade_estoque().getQuantidade());
                quantidadeatualizada = produtonobanco.getQuantidade_estoque().getQuantidade() - p.getQuantidade_estoque().getQuantidade();
                produtonobanco.getQuantidade_estoque().setQuantidade(quantidadeatualizada);
                bancoProduto.updateProduto(produtonobanco);
            }
        }
        venda.setValor_final_venda(valor);
        bancoVenda.insertVenda(venda);
        return true;
    }

    public boolean atualizarVenda(Venda venda) {
        List<Produto> listaProdutoVendido = venda.getProdutos();
        double valor = 0.0;
        int quantidadeatualizada;
        Produto produtonobanco;

        for(Produto p : listaProdutoVendido){
            produtonobanco = bancoProduto.findOneProduto(p.getId());
            if (produtonobanco.getQuantidade_estoque().getQuantidade() < p.getQuantidade_estoque().getQuantidade()) {
                return false;
            }

            valor = valor + (p.getPreco() * p.getQuantidade_estoque().getQuantidade());
            quantidadeatualizada = produtonobanco.getQuantidade_estoque().getQuantidade() - p.getQuantidade_estoque().getQuantidade();
            produtonobanco.getQuantidade_estoque().setQuantidade(quantidadeatualizada);
            bancoProduto.updateProduto(produtonobanco);
        }
        venda.setValor_final_venda(valor);
        return bancoVenda.updateVenda(venda);
    }

    public boolean deletarVenda(int id) {
        return bancoVenda.deleteVenda(id);
    }
}
