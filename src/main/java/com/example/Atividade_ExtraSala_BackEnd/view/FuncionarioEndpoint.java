package com.example.Atividade_ExtraSala_BackEnd.view;

import com.example.Atividade_ExtraSala_BackEnd.controller.FuncionarioController;
import com.example.Atividade_ExtraSala_BackEnd.model.Funcionario;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioEndpoint {

    FuncionarioController cf = new FuncionarioController();

    @GetMapping
    public List<Funcionario> getInformationsFuncionarios() {
        return cf.listarFuncionario();
    }

    @PostMapping
    public String postInformationsFuncionarios(@RequestBody Funcionario funcionario) {
        cf.postarFuncionario(funcionario);
        return "Sucesso ao cadastrar";
    }

    @PutMapping
    public String putInformationsFuncionarios(@RequestBody Funcionario funcionario) {
        if (cf.atualizarFuncionario(funcionario)) {
            return "Sucesso ao atualizar o cliente!";
        } else {
            return "Falha ao atualizar o cliente...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsFuncionarios(@RequestParam int id) {
        if (cf.deletarFuncionario(id)) {
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}
