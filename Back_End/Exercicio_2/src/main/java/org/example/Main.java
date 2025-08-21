package org.example;

import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        geraSenha();
        geraJogador();
        geraPokemon();
    }

    static void geraSenha(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int tamanhoSenha = 8;

        Random criaSenha = new Random();

        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanhoSenha; i++) {
            int indice = criaSenha.nextInt(caracteres.length());
            senha.append(caracteres.charAt(indice));
        }

        System.out.println("Senha gerada: " + senha.toString());
    }

    static void geraJogador(){
        String[] nomes = {"Cássio", "Neymar", "Gabriel", "Thiago", "Lucas", "Felipe", "Anderson", "Diego"};
        String[] sobrenomes = {"Ramos", "Silva", "Santos", "Alves", "Souza", "Pereira", "Oliveira", "Costa"};
        String[] posicoes = {"goleiro", "zagueiro", "meio-campista", "atacante", "lateral"};
        String[] times = {"Corinthians", "Flamengo", "Palmeiras", "São Paulo", "Grêmio", "Internacional", "Fluminense", "Vasco"};

        Random random = new Random();

        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        String posicao = posicoes[random.nextInt(posicoes.length)];
        String time = times[random.nextInt(times.length)];

        int idade = 17 + random.nextInt(24);

        String jogador = nome + " " + sobrenome + " é um futebolista brasileiro de "
                + idade + " anos que atua como " + posicao
                + ". Atualmente defende o " + time + ".";

        System.out.println(jogador);
    }

    static void geraPokemon(){
        String[] nomes = {"Pikachu", "Charmander", "Squirtle", "Bulbasaur", "Eevee", "Snorlax", "Gengar", "Mewtwo", "Lucario", "Charizard"};
        String[] tipos = {"Elétrico", "Fogo", "Água", "Planta", "Psíquico", "Sombrio", "Pedra", "Terra", "Gelo", "Dragão"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Pokémons deseja gerar? ");
        int quantidade = scanner.nextInt();

        System.out.println("\n=== Pokémons Gerados ===");

        for (int i = 0; i < quantidade; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String tipo = tipos[random.nextInt(tipos.length)];
            int nivel = 1 + random.nextInt(100);

            System.out.println(nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".");
        }
        scanner.close();
    }
    }