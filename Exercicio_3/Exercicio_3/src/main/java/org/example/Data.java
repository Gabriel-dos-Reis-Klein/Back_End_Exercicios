package org.example;

import java.time.Year;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor
    public Data(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    // Getters e Setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (mesValido(mes) && diaValido(dia, mes, ano)) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido! Ajustando para 1.");
            this.dia = 1;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido! Ajustando para 1.");
            this.mes = 1;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! Ajustando para 1.");
            this.ano = 1;
        }
    }

    // Método para verificar se mês é válido
    private boolean mesValido(int mes) {
        return mes >= 1 && mes <= 12;
    }

    // Método para verificar se o dia é válido para o mês e ano
    private boolean diaValido(int dia, int mes, int ano) {
        int[] diasPorMes = {31, (Year.isLeap(ano) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    // Método para exibir data no formato dia/mes/ano
    public void displayData() {
        System.out.printf("%02d/%02d/%d\n", dia, mes, ano);
    }
}
