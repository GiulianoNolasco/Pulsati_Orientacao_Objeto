package com.mycompany.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        computador dell = new computador();
        dell.memoria = 16;
        dell.processador = "Amd 1987";

        computador positivo = new computador();
        positivo.memoria = 1;
        positivo.processador = "Fracox67";

        dell.imprimeComputador();
        positivo.imprimeComputador();

    }
}
