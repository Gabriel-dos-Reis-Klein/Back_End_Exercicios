package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Batalha {
    public static void main(String[] args) {
        List<Personagem> inimigos = new ArrayList<>();
        inimigos.add(new Personagem("Orc", 100, 10));
        inimigos.add(new Personagem("Goblin", 50, 5));
        inimigos.add(new Personagem("Lobo", 75, 15));
//        inimigos.add(new Personagem("Dragão", 500, 50));

        Personagem jogador = new Personagem("Steve", 100, 30);

        Random random = new Random();

        while (jogador.estaVivo() && inimigos.stream().anyMatch(Personagem::estaVivo)) {
            // Jogador ataca inimigo aleatório com vida > 0
            List<Personagem> vivos = new ArrayList<>();
            for (Personagem inimigo : inimigos) {
                if (inimigo.estaVivo()) {
                    vivos.add(inimigo);
                }
            }

            if (!vivos.isEmpty()) {
                Personagem alvo = vivos.get(random.nextInt(vivos.size()));
                System.out.println(jogador.getNome() + " ataca " + alvo.getNome());
                jogador.atacar(alvo);
            }

            // Inimigos atacam o jogador
            for (Personagem inimigo : inimigos) {
                if (inimigo.estaVivo() && jogador.estaVivo()) {
                    System.out.println(inimigo.getNome() + " ataca " + jogador.getNome());
                    inimigo.atacar(jogador);
                }
            }

            System.out.println("Vida de " + jogador.getNome() + ": " + jogador.getVida());
            System.out.println("-------------------------");
        }

        // Resultado final
        if (!jogador.estaVivo()) {
            System.out.println(jogador.getNome() + " foi derrotado!");
        } else {
            System.out.println(jogador.getNome() + " venceu todos os inimigos!");
        }
    }
}
