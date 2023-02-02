package com.mycompany.exerciciofinal1;

public class CalculadoraImpl implements Calculadora {

    @Override
    public int somar(int v1, int v2) {
        return v1 + v2;
    }

    @Override
    public int subtrair(int v1, int v2) {
        return v1 - v2;
    }

}
