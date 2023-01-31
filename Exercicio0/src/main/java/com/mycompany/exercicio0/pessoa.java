package com.mycompany.exercicio0;

public class pessoa {

    String nome;
    int idade;
    double altura;
    double peso;

    public void CalcularIMC(pessoa p1) {
        double resultado = ((p1.peso / Math.pow(p1.altura, 2)));
        if (resultado < 18.5) {
            System.out.println("O seu IMC é de " + Math.floor(resultado) + ". Você está com MAGREZA;");
        } else if (resultado < 24.9) {
            System.out.println("O seu IMC é de " + Math.floor(resultado) + ". Você está no peso NORMAL;");
        } else if (resultado
                < 29.9) {
            System.out.println("O seu IMC é de " + Math.floor(resultado) + ". Você está com SOBREPESO;");
        } else if (resultado < 39.9) {
            System.out.println("O seu IMC é de " + Math.floor(resultado) + ". Você está com OBESIDADE;");
        } else {
            System.out.println("O seu IMC é de " + Math.floor(resultado) + ". Você está com OBESIDADE GRAVE;");
        }
    }
}
