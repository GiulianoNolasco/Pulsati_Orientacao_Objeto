package com.mycompany.bancocominterface;

public class conta {

    private String nomeTitular;
    private int idadeTitular;
    private int numeroConta;
    private double saldo;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getIdadeTitular() {
        return idadeTitular;
    }

    public void setIdadeTitular(int idadeTitular) {
        this.idadeTitular = idadeTitular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
