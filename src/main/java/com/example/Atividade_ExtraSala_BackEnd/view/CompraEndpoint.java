package com.example.Atividade_ExtraSala_BackEnd.view;

import com.example.Atividade_ExtraSala_BackEnd.controller.CompraController;
import com.example.Atividade_ExtraSala_BackEnd.model.Compra;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/compras")
public class CompraEndpoint {

    CompraController cc = new CompraController();

    @GetMapping
    public List<Compra> getInformationsCompras() {
        return cc.listarCompra();
    }

    @PostMapping
    public String postInformationsCompras(@RequestBody Compra compra) {
        cc.postarCompra(compra);
        return "Sucesso ao cadastrar";
    }

    @PutMapping
    public String putInformationsCompras(@RequestBody Compra compra) {
        if (cc.atualizarCompra(compra)) {
            return "Sucesso ao atualizar o cliente!";
        } else {
            return "Falha ao atualizar o cliente...";
        }
    }

    @DeleteMapping("/{id}")
    public String deleteInformationsCompras(@RequestParam int id) {
        if (cc.deletarCompra(id)) {
            return "Deletado com sucesso";
        } else {
            return "Falha ao deletar...";
        }
    }
}
