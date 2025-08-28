package org.example;

public class DataTeste {
    public static void main(String[] args) {
        // Datas válidas
        Data data1 = new Data(15, 8, 2025); // 15/08/2025
        Data data2 = new Data(29, 2, 2024); // 29/02/2024 (ano bissexto)
        Data data3 = new Data(31, 12, 2023); // 31/12/2023

        // Exibindo as datas válidas
        System.out.println("Datas válidas:");
        data1.displayData();
        data2.displayData();
        data3.displayData();

        // Datas inválidas
        System.out.println("\nTentando criar datas inválidas:");
        Data data4 = new Data(31, 4, 2025); // Abril tem 30 dias
        Data data5 = new Data(29, 2, 2023); // 2023 não é bissexto
        Data data6 = new Data(10, 13, 2025); // Mês inválido
        Data data7 = new Data(-5, 5, -100); // Dia e ano inválidos

        // Exibindo datas ajustadas
        System.out.println("\nDatas após ajuste:");
        data4.displayData();
        data5.displayData();
        data6.displayData();
        data7.displayData();
    }
}
