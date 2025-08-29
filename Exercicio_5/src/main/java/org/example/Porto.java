package org.example;

import java.util.ArrayList;
import java.util.List;

public class Porto {
    public static void main(String[] args) {
        // Criar barcos
        List<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("Barco 1", 2));
        barcos.add(new Barco("Barco 2", 5));
        barcos.add(new Barco("Barco 3", 7));
        barcos.add(new Barco("Barco 4", 12));
        barcos.add(new Barco("Barco 5", 20));

        // Criar portos
        PortoPequeno portoPequeno = new PortoPequeno("porto pequeno");
        PortoGrande portoGrande = new PortoGrande("porto grande");

        // Tentar atracar os barcos
        for (Barco barco : barcos) {
            if (!portoPequeno.atracarBarco(barco)) {
                if (!portoGrande.atracarBarco(barco)) {
                    System.out.println(barco.getNome() + " não pôde ser atracado em nenhum porto.");
                }
            }
        }
    }
}

