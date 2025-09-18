package org.Cinema.cinema;


import org.Cinema.cinema.filme;
import org.Cinema.cinema.ingresso;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/filmes")
public class filmeController {

    private final List<filme> filmes = new ArrayList<>();

    // 🔸 CRUD de Filmes

    @GetMapping
    public List<filme> getFilmes() {
        return filmes;
    }

    @PostMapping
    public String criarFilme(@RequestBody filme novoFilme) {
        novoFilme.setId(UUID.randomUUID());
        novoFilme.setAssentosOcupados(0);
        novoFilme.setIngressos(new ArrayList<>());
        filmes.add(novoFilme);
        return "Filme criado com sucesso! ID: " + novoFilme.getId();
    }

    @PatchMapping("/{id}")
    public String atualizarFilme(@PathVariable UUID id, @RequestBody filme atualizacao) {
        Optional<filme> filmeOptional = filmes.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst();

        if (filmeOptional.isPresent()) {
            filme filme = filmeOptional.get();
            if (atualizacao.getTitulo() != null) filme.setTitulo(atualizacao.getTitulo());
            if (atualizacao.getGenero() != null) filme.setGenero(atualizacao.getGenero());
            if (atualizacao.getCapacidade() > 0) filme.setCapacidade(atualizacao.getCapacidade());
            return "Filme atualizado com sucesso.";
        }

        return "Filme não encontrado.";
    }

    @DeleteMapping("/{id}")
    public String deletarFilme(@PathVariable UUID id) {
        boolean removido = filmes.removeIf(f -> f.getId().equals(id));
        return removido ? "Filme deletado com sucesso." : "Filme não encontrado.";
    }

    // 🔸 Ingressos

    @PostMapping("/{id}/ingressos")
    public String comprarIngresso(@PathVariable UUID id) {
        Optional<filme> filmeOptional = filmes.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst();

        if (filmeOptional.isPresent()) {
            filme filme = filmeOptional.get();

            if (filme.getAssentosOcupados() >= filme.getCapacidade()) {
                return "Não há assentos disponíveis.";
            }

            int novoAssento = filme.getAssentosOcupados() + 1;
            ingresso ingresso = new ingresso(filme.getId(), novoAssento);

            filme.getIngressos().add(ingresso);
            filme.setAssentosOcupados(novoAssento);

            return "Ingresso comprado com sucesso! ID: " + ingresso.getIngressoId();
        }

        return "Filme não encontrado.";
    }

    @DeleteMapping("/{id}/ingressos/{ingressoId}")
    public String cancelarIngresso(@PathVariable UUID id, @PathVariable UUID ingressoId) {
        Optional<filme> filmeOptional = filmes.stream()
                .filter(f -> f.getId().equals(id))
                .findFirst();

        if (filmeOptional.isPresent()) {
            filme filme = filmeOptional.get();
            Optional<ingresso> ingressoOptional = filme.getIngressos().stream()
                    .filter(i -> i.getIngressoId().equals(ingressoId))
                    .findFirst();

            if (ingressoOptional.isPresent()) {
                filme.getIngressos().remove(ingressoOptional.get());
                filme.setAssentosOcupados(filme.getAssentosOcupados() - 1);
                return "Ingresso cancelado e assento liberado.";
            } else {
                return "Ingresso não encontrado.";
            }
        }

        return "Filme não encontrado.";
    }
}