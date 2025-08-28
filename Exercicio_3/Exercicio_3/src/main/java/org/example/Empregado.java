package org.example;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor
    public Empregado(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalarioMensal(salarioMensal); // usando setter para validar
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0) {
            this.salarioMensal = 0.0;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    // Método para calcular salário anual (inclui décimo terceiro)
    public double getSalarioAnual() {
        return salarioMensal * 13;
    }

    // Método para aplicar aumento percentual
    public void aplicarAumento(double percentual) {
        salarioMensal += salarioMensal * (percentual / 100);
    }
}

