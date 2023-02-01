package com.mycompany.exercicioconstrutor1;

public class endereco {

    private String rua;
    private int numero;
    private int cep;

    endereco() {
    }

    endereco(String rua, int numero, int cep) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

}
