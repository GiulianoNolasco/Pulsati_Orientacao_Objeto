package com.mycompany.bancocominterface;

public class contaPoupanca extends conta implements movimentaSaldo {

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);

    }

    @Override
    public void sacar(double valor) {
        if ((valor) < getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Você não tem saldo o suficiente.");
        }
    }

}
