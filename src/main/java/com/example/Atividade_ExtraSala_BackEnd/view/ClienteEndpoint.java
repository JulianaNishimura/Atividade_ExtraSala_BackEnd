package com.example.Atividade_ExtraSala_BackEnd.view;

import com.example.Atividade_ExtraSala_BackEnd.controller.ClienteController;
import com.example.Atividade_ExtraSala_BackEnd.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteEndpoint {

    ClienteController cc = new ClienteController();

    @GetMapping
    public List<Cliente> getInformationsClientes() {
        return cc.listarClientes();
    }

    @PostMapping
    public String postInformationsClientes(@RequestBody Cliente cliente) {
        cc.postarCliente(cliente);
        return "Sucesso ao cadastrar";
    }

    @PutMapping
    public String putInformationsClientes(@RequestBody Cliente cliente){
        if(cc.atualizarCliente(cliente)){
            return "Sucesso ao atualizar o cliente!";
        } else {
            return "Falha ao atualizar o cliente...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsCliente(@RequestParam int id){
        if(cc.deletarCliente(id)){
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}
