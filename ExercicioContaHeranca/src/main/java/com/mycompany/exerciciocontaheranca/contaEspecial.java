package com.mycompany.exerciciocontaheranca;

public class contaEspecial extends conta {

    private double limite;

    public void depositar(double valorDeposito) {
        setSaldo(getSaldo() + valorDeposito);
        System.out.println("Valor depositado com sucesso: R$ " + valorDeposito + " O saldo atual é de: R$" + getSaldo() + "O limite atual é de: R$" + getLimite());

    }

    public void sacar(double valorSacado) {
        if ((valorSacado) > (getSaldo() + getLimite())) {
            System.out.println("Não é possível efetuar o saque, pois o saldo ficará negativo em: R$ " + (getSaldo() - valorSacado));
        } else {
            setSaldo(getSaldo() - valorSacado);
            System.out.println("Valor sacado com sucesso: R$ " + valorSacado + " O saldo atual é de: R$" + getSaldo() + "O limite atual é de: R$" + getLimite());
        }
    }

    public void verSaldo() {
        System.out.println("O saldo atual da conta é de: R$ " + getSaldo());
        System.out.println("O limite da sua conta é: R$ " + getLimite());

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
