package com.example.Atividade_ExtraSala_BackEnd.view;

import com.example.Atividade_ExtraSala_BackEnd.controller.FornecedorController;
import com.example.Atividade_ExtraSala_BackEnd.model.Fornecedor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorEndpoint {

    FornecedorController cf = new FornecedorController();

    @GetMapping
    public List<Fornecedor> getInformationsFornecedores() {
        return cf.listarFornecedor();
    }

    @PostMapping
    public String postInformationsFornecedores(@RequestBody Fornecedor fornecedor) {
        cf.postarFornecedor(fornecedor);
        return "Sucesso ao cadastrar";
    }

    @PutMapping
    public String putInformationsFornecedores(@RequestBody Fornecedor fornecedor) {
        if (cf.atualizarFornecedor(fornecedor)) {
            return "Sucesso ao atualizar o cliente!";
        } else {
            return "Falha ao atualizar o cliente...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsFornecedores(@PathVariable int id) {
        if (cf.deletarFornecedor(id)) {
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}
