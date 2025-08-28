package org.example;

public class FaturaTeste {
    public static void main(String[] args) {
        // Criando dois objetos Fatura
        Fatura fatura1 = new Fatura("001", "Teclado Mecânico", 2, 250.50);
        Fatura fatura2 = new Fatura("002", "Mouse Gamer", -5, 120.00); // quantidade negativa vira 0

        // Exibindo informações da primeira fatura
        System.out.println("Fatura 1:");
        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidade());
        System.out.println("Preço por item: R$ " + fatura1.getPrecoPorItem());
        System.out.println("Total: R$ " + fatura1.getTotalFatura());

        System.out.println("\nFatura 2:");
        System.out.println("Número: " + fatura2.getNumero());
        System.out.println("Descrição: " + fatura2.getDescricao());
        System.out.println("Quantidade: " + fatura2.getQuantidade());
        System.out.println("Preço por item: R$ " + fatura2.getPrecoPorItem());
        System.out.println("Total: R$ " + fatura2.getTotalFatura());
    }
}
