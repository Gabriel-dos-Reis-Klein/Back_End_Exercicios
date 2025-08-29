package org.example;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque(){
        return ataque;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida <= 0) {
            vida = 0;
            System.out.println(nome + " foi derrotado!");
        }
    }

    public void atacar(Personagem alvo) {
        if (!alvo.estaVivo()) {
            System.out.println("O ataque falhou! " + alvo.getNome() + " já está derrotado.");
            return;
        }
        alvo.receberDano(ataque);
    }
}
