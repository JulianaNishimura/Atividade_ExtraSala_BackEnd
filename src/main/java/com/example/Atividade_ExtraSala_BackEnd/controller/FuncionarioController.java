package com.example.Atividade_ExtraSala_BackEnd.controller;

import com.example.Atividade_ExtraSala_BackEnd.database.BancoFuncionario;
import com.example.Atividade_ExtraSala_BackEnd.model.Funcionario;
import java.util.List;

public class FuncionarioController {
    BancoFuncionario banco = BancoFuncionario.getInstance();

    public List<Funcionario> listarFuncionario() {
        return banco.findAllFuncionario();
    }

    public void postarFuncionario(Funcionario funcionario) {
        banco.insertFuncionario(funcionario);
    }

    public boolean atualizarFuncionario(Funcionario funcionario) {
        return banco.updateFuncionario(funcionario);
    }

    public boolean deletarFuncionario(int id) {
        return banco.deleteFuncionario(id);
    }
}
