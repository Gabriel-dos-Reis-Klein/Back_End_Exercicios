package org.example;

public class EmpregadoTeste {
    public static void main(String[] args) {
        // Criando dois empregados
        Empregado emp1 = new Empregado("João", "Silva", 3000.00);
        Empregado emp2 = new Empregado("Maria", "Oliveira", 4500.00);

        // Mostrando salários anuais antes do aumento
        System.out.println("Antes do aumento:");
        System.out.println(emp1.getNome() + " " + emp1.getSobrenome() + " - Salário anual: R$ " + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + " " + emp2.getSobrenome() + " - Salário anual: R$ " + emp2.getSalarioAnual());

        // Aplicando aumento de 10% no salário mensal
        emp1.aplicarAumento(10);
        emp2.aplicarAumento(10);

        // Mostrando salários anuais depois do aumento
        System.out.println("\nApós o aumento de 10%:");
        System.out.println(emp1.getNome() + " " + emp1.getSobrenome() + " - Salário anual: R$ " + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + " " + emp2.getSobrenome() + " - Salário anual: R$ " + emp2.getSalarioAnual());
    }
}
