package com.mycompany.exemploabstracao;

public abstract class pessoa {

    private String nome;
    private int idade;

    public abstract void imprime();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
