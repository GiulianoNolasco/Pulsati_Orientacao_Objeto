package com.mycompany.exercicio6;

public class Exercicio6 {

    public static void main(String[] args) {
        professor Lucas = new professor();
        Lucas.curso = "Java";
        Lucas.nome = "Lucas";

        professor Jhonny = new professor();
        Jhonny.nome = "Jhonny";
        Jhonny.curso = "Javascript";

        Jhonny.imprimeProfessor();
        Lucas.imprimeProfessor();
    }
}
