package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;

    public Cinema() {
        this.filmesDisponiveis = new ArrayList<>();
        this.ingressosVendidos = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nome) {
        for (Filme f : filmesDisponiveis) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }

    public boolean assentoDisponivel(String assento) {
        for (Ingresso i : ingressosVendidos) {
            if (i.getAssento().equalsIgnoreCase(assento)) {
                return false;
            }
        }
        return true;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        if (!assentoDisponivel(ingresso.getAssento())) {
            throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
        }

        if (ingresso.getCliente().getIdade() < ingresso.getFilme().getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        ingressosVendidos.add(ingresso);
        System.out.println("Ingresso vendido com sucesso! " + ingresso);
    }
}
