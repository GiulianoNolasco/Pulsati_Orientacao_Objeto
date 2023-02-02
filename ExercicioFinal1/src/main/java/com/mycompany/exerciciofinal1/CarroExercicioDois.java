package com.mycompany.exerciciofinal1;

public class CarroExercicioDois {

    private int potencia;
    private int velocidade;
    private String marca;


    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}

/*

1. Crie uma classe Carro com três variáveis membro: potência, velocidade e marca. Crie duas classes filhas 
chamadas Sedan e SUV que herdam os atributos da classe Carro. Adicione um método acelerar() às duas classes
filhas que simule o comportamento de aceleração dos carros de acordo com suas respectivas potências.

 */
