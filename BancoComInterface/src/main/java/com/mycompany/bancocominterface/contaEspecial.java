package com.mycompany.bancocominterface;

public class contaEspecial extends conta implements controlaCredito, movimentaSaldo {

    private double limite;

    @Override
    public boolean verificaCredito(double valorRequirido) {
        return (this.getSaldo() + this.getLimite() >= valorRequirido);
    }

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        if (verificaCredito(valor)) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Você não tem crédito o suficiente.");
        }
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
