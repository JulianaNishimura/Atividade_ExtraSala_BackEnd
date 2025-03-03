package com.example.Atividade_ExtraSala_BackEnd.view;

import com.example.Atividade_ExtraSala_BackEnd.controller.ProdutoController;
import com.example.Atividade_ExtraSala_BackEnd.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoEndpoint {

    ProdutoController cp = new ProdutoController();

    @GetMapping
    public List<Produto> getInformationsProdutos() {
        return cp.listarProduto();
    }

    @PostMapping
    public String postInformationsProdutos(@RequestBody Produto produto) {
        cp.postarProduto(produto);
        return "Sucesso ao Cadastrar!";
    }

    @PutMapping
    public String putInformationsProdutos(@RequestBody Produto produto) {
        if (cp.atualizarProduto(produto)) {
            return "Sucesso ao atualizar produto!";
        } else {
            return "Falha ao atualizar produto...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsProduto(@RequestParam int id) {
        if (cp.deletarProduto(id)) {
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}
