package org.example;

import java.util.Scanner;

public class Assistir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        // Adicionar filmes disponíveis
        cinema.adicionarFilme(new Filme("Homem Aranha", 20.0, 12));
        cinema.adicionarFilme(new Filme("Vingadores", 25.0, 10));
        cinema.adicionarFilme(new Filme("Deadpool", 30.0, 18));
        cinema.adicionarFilme(new Filme("Divertidamente 2", 22.0, 0));
        cinema.adicionarFilme(new Filme("A Freira", 28.0, 16));

        String continuar = "s";

        do {
            System.out.println("\nQue filme você deseja assistir?");
            String nomeFilme = scanner.nextLine();

            Filme filmeEscolhido = cinema.buscarFilme(nomeFilme);
            if (filmeEscolhido == null) {
                System.out.println("Filme não encontrado.");
                continue;
            }

            System.out.println("Qual assento você deseja? (ex: A1, B3, F5)");
            String assento = scanner.nextLine();

            System.out.println("Qual o seu nome?");
            String nomeCliente = scanner.nextLine();

            System.out.println("Qual a sua idade?");
            int idade = Integer.parseInt(scanner.nextLine());

            Cliente cliente = new Cliente(nomeCliente, idade);
            Ingresso ingresso = new Ingresso(cliente, filmeEscolhido, assento);

            try {
                cinema.venderIngresso(ingresso);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Deseja comprar outro ingresso? (s/n): ");
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

        scanner.close();
    }
}

