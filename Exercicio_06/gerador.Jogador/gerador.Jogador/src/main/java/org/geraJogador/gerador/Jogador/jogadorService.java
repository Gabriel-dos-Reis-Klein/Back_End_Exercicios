package org.geraJogador.gerador.Jogador;

import org.geraJogador.gerador.Jogador.jogador;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class jogadorService {

    private final List<String> nomes = List.of("Carlos", "João", "Pedro", "Lucas", "Rafael", "Matheus");
    private final List<String> sobrenomes = List.of("Silva", "Souza", "Oliveira", "Costa", "Pereira", "Ferreira");

    private final Random random = new Random();

    public jogador gerarJogador(String time, String posicao) {
        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        int idade = 18 + random.nextInt(20); // idade entre 18 e 37

        return new jogador(nome, sobrenome, idade, posicao, time);
    }
}