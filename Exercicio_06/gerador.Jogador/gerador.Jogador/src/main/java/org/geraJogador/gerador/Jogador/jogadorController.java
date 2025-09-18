package org.geraJogador.gerador.Jogador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jogadorController {

    private final jogadorService jogadorService;

    public jogadorController(jogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/jogador/{time}/{posicao}")
    public jogador gerarJogador(@PathVariable String time, @PathVariable String posicao) {
        return jogadorService.gerarJogador(time, posicao);
    }
}
