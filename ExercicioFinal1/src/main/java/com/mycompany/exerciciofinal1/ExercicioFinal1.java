package com.mycompany.exerciciofinal1;

public class ExercicioFinal1 {

    public static void main(String[] args) {
        Carro Palio = new Carro();

        Palio.getVelocidadeCarro();
        Palio.acelerar();
        Palio.velocidadeAtual();
        Palio.mudarMarcha(2);
        Palio.acelerar();
        Palio.acelerar();
        Palio.acelerar();
        Palio.mudarMarcha(+3);
        
        Palio.acelerar();
        Palio.velocidadeAtual();
        Palio.frear();
        Palio.velocidadeAtual();

        CalculadoraImpl calc1 = new CalculadoraImpl();
        System.out.println(calc1.somar(5, 10));
    }
}
