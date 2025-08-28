package org.example;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double precoPorItem;

    // Construtor
    public Fatura(String numero, String descricao, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);    // usando setter para validar
        setPrecoPorItem(precoPorItem); // usando setter para validar
    }

    // Getters e Setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        if (precoPorItem < 0) {
            this.precoPorItem = 0.0;
        } else {
            this.precoPorItem = precoPorItem;
        }
    }

    // Método para calcular total da fatura
    public double getTotalFatura() {
        return quantidade * precoPorItem;
    }
}
