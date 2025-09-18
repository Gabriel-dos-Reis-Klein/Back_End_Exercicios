package org.Time.Futebol;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class timeController {

    private final List<jogador> jogadores = new ArrayList<>();

    public timeController() {
        // Adiciona 11 jogadores titulares
        for (int i = 0; i < 11; i++) {
            jogadores.add(new jogador("Titular " + (i + 1), "Posição " + (i + 1), 20 + i));
        }

        // Adiciona 5 reservas
        for (int i = 0; i < 5; i++) {
            jogadores.add(new jogador("Reserva " + (i + 1), "Posição R" + (i + 1), 22 + i));
        }
    }


    @GetMapping("/principal")
    public List<jogador> getTitulares() {
        return jogadores.subList(0, 11);
    }

    @GetMapping("/reservas")
    public List<jogador> getReservas() {
        return jogadores.subList(11, jogadores.size());
    }

    @PutMapping("/jogador/{posicao}")
    public String substituirJogador(@PathVariable int posicao, @RequestBody jogador novoJogador) {
        if (posicao < 0 || posicao > 10) {
            return "Posição inválida. Informe uma posição de 0 a 10 para titulares.";
        }

        boolean reservaEncontrada = jogadores.subList(11, jogadores.size()).removeIf(reserva ->
                reserva.getNome().equals(novoJogador.getNome()) &&
                        reserva.getPosicao().equals(novoJogador.getPosicao()) &&
                        reserva.getIdade() == novoJogador.getIdade()
        );

        if (!reservaEncontrada) {
            return "Jogador informado não está na lista de reservas.";
        }

        jogador substituido = jogadores.get(posicao);
        jogadores.set(posicao, novoJogador);
        jogadores.add(substituido); // o titular substituído vira reserva

        return "Substituição realizada com sucesso.";
    }
}

