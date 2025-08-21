package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Olá Mundo!\n");
        bem_Vindo();
        func();
        venda();
        desconto();
        fase_Vida();
        notas_Aluno();
        IMC();
        cliente();
    }

    static void bem_Vindo(){
        String mensagem = "Bem-vindo ao Sistema de Geração de Jogadores!";
        System.out.println(mensagem);
    }

    static void func(){
        String nome = "Gabriel Reis";
        String cargo = "Back-End";
        String salario = "R$ 3500.00";
        System.out.println("Nome: " + nome + "\nCargo: " + cargo + "\nSalário: " + salario);
    }

    static void venda(){
        String produto = "Teclado";
        int codigo = 12345;
        double preco = 99.90;
        boolean promocao = true;
        System.out.println("Produto: " + produto + "\nCódigo: " + codigo + "\nPreço: R$ " + preco + "\nPromoção: " + promocao);
    }

    static void desconto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o Valor do Produto: ");
        double valor = leitor.nextDouble();

        if (valor >= 100){
            double valorDesc = valor - (valor * 0.10);
            System.out.println("Valor Final com Desconto: R$ " + valorDesc);
        }else {
            System.out.println("Valor Final sem Desconto: R$ " + valor);
        }
    }

    static void fase_Vida(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua Idade: ");
        int idade = leitor.nextInt();

        if (idade >= 0 && idade < 12){
            System.out.println("Categoria: Infatil");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Categoria: Adolescente");
        } else if (idade >= 18) {
            System.out.println("Categoria: Adulto");
        }else {
            System.out.println("Por favor Colocar Idade Correta");
        }
    }

    static void notas_Aluno(){
        int[] notas = {7, 8, 6, 9, 10};

        int soma = 0;

        System.out.print("Notas: ");
        for (int nota : notas) {
            System.out.print(nota + " ");
            soma += nota;
        }

        // Calculando a média
        double media = (double) soma / notas.length;

        // Imprimindo a média
        System.out.println("\nMédia: " + media);
    }

    static void IMC(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite Seu Peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite Sua Altura: ");
        double altura = leitor.nextDouble();

        double calc_IMC = peso / (altura * altura);

        if (calc_IMC >= 0 && calc_IMC < 18.5){
            System.out.println("Você está Magro com IMC de:" + calc_IMC);
        } else if (calc_IMC >= 18.5 && calc_IMC < 24.9) {
            System.out.println("Você está Normal com IMC de:" + calc_IMC);
        } else if (calc_IMC >= 24.9 && calc_IMC < 30) {
            System.out.println("Você está com Sobrepeso com IMC de:" + calc_IMC);
        } else if (calc_IMC >= 30) {
            System.out.println("Você está com Obesidade com IMC de:" + calc_IMC);
        }else {
            System.out.println("Por favor Colocar Peso e Altura Correta");
        }
    }

    static void cliente(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite Seu Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Número de Caracteres: " + nome.length());
        System.out.println("Maiúsculas: " + nome.toUpperCase());
        System.out.println("Contém 'Silva': " + nome.equals("Silva"));
    }
}