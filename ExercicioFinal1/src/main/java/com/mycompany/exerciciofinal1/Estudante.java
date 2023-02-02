package com.mycompany.exerciciofinal1;

public class Estudante extends Pessoa {

    private int identificadorEstudante;

    public void retornaNomeCompleto() {
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade() + ", Matrícula: " + getIdentificadorEstudante() + ".");
    }

    public int getIdentificadorEstudante() {
        return identificadorEstudante;
    }

    public void setIdentificadorEstudante(int identificadorEstudante) {
        this.identificadorEstudante = identificadorEstudante;
    }

}
