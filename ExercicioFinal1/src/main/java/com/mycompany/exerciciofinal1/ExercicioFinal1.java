package com.mycompany.exerciciofinal1;

import java.sql.SQLOutput;

public class ExercicioFinal1 {

    public static void main(String[] args) {
        /* Carro Palio = new Carro();

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
        
         */
        SedanExercicio2 Carro2 = new SedanExercicio2(115, "Fiat");
        Carro2.acelerar();
        Carro2.velocidadeAtual();
        
        SuvExercicio2 Carro3 = new SuvExercicio2(180, "Audi");
        Carro3.acelerar();
        Carro3.acelerar();
        Carro3.acelerar();
        Carro3.velocidadeAtual();
        Carro3.frear();
        Carro3.velocidadeAtual();

    }
}
