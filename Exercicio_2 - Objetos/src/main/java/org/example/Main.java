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
            Senha senha1 = new Senha(senha);
            if (i == 7) {
                System.out.println("Senha gerada: " + senha1.senha.toString());
            }
        }

    }

    static void geraJogador(){
        String[] nomes = {"Cássio", "Neymar", "Gabriel", "Thiago", "Lucas", "Felipe", "Anderson", "Diego"};
        String[] sobrenomes = {"Ramos", "Silva", "Santos", "Alves", "Souza", "Pereira", "Oliveira", "Costa"};
        String[] posicoes = {"goleiro", "zagueiro", "meio-campista", "atacante", "lateral"};
        String[] clubes = {"Corinthians", "Flamengo", "Palmeiras", "São Paulo", "Grêmio", "Internacional", "Fluminense", "Vasco"};

        Random random = new Random();

        for (int i = 1; i <= 11; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
            String posicao = posicoes[random.nextInt(posicoes.length)];
            String clube = clubes[random.nextInt(clubes.length)];
            int idade = 17 + random.nextInt(24);

            Jogador jogador1 = new Jogador(nome, sobrenome, posicao, clube, idade);
            String jogador = i + ". " + jogador1.nome + " " + jogador1.sobrenome + " é um futebolista brasileiro de "
                    + jogador1.idade + " anos que atua como " + jogador1.posicao
                    + ". Atualmente defende o " + jogador1.clube + ".";
            System.out.println(jogador);
        }
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

            Pokemon pokemon = new Pokemon(nome, tipo, nivel);

            System.out.println(pokemon.nome + " é um Pokémon do tipo " + pokemon.tipo + " de nível " + pokemon.level + ".");
        }
        scanner.close();
    }
    }