package org.example;

public class Jogador {
    String nome;
    String sobrenome;
    String clube;
    String posicao;
    int idade;

    Jogador(String nome, String sobrenome, String posicao, String clube, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.posicao = posicao;
        this.clube = clube;
        this.idade = idade;
    }
}
