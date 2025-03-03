package com.example.Atividade_ExtraSala_BackEnd.database;

import com.example.Atividade_ExtraSala_BackEnd.model.Compra;

import java.util.ArrayList;
import java.util.List;

public class BancoCompra {
    private static BancoCompra instance;
    private List<Compra> compras = new ArrayList<>();

    public static BancoCompra getInstance() {
        if (instance == null) {
            instance = new BancoCompra();
        }
        return instance;
    }

    public void insertCompra(Compra c) {
        compras.add(c);
    }

    public Compra findOneCompra(int id) {
        for (Compra c : compras) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public List<Compra> findAllCompra() {
        return new ArrayList<>(compras);
    }

    public boolean updateCompra(Compra c) {
        for (int i = 0; i < compras.size(); i++) {
            if (compras.get(i).getId() == c.getId()) {
                compras.set(i, c);
                return true;
            }
        }
        return false;
    }

    public boolean deleteCompra(int id) {
        return compras.removeIf(c -> c.getId() == id);
    }

    public Compra findByFornecedorCompra(String fornecedorNome) {
        for (Compra c : compras) {
            if (c.getFornecedor().getNome().equalsIgnoreCase(fornecedorNome)) {
                return c;
            }
        }
        return null;
    }
}
