package com.example.Atividade_ExtraSala_BackEnd.database;

import com.example.Atividade_ExtraSala_BackEnd.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class BancoVenda {
    private static BancoVenda instance;
    private List<Venda> vendas = new ArrayList<>();

    public static BancoVenda getInstance() {
        if (instance == null) {
            instance = new BancoVenda();
        }
        return instance;
    }

    public void insertVenda(Venda v) {
        vendas.add(v);
    }

    public Venda findOneVenda(int id) {
        for (Venda v : vendas) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }

    public List<Venda> findAllVenda() {
        return new ArrayList<>(vendas);
    }

    public boolean updateVenda(Venda v) {
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getId() == v.getId()) {
                vendas.set(i, v);
                return true;
            }
        }
        return false;
    }

    public boolean deleteVenda(int id) {
        return vendas.removeIf(v -> v.getId() == id);
    }

    public Venda findByClienteVenda(String clienteNome) {
        for (Venda v : vendas) {
            if (v.getCliente().getNome().equalsIgnoreCase(clienteNome)) {
                return v;
            }
        }
        return null;
    }
}
