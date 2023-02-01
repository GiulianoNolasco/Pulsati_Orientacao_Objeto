package com.mycompany.exercicio4pilares2contabancaria;

public class conta {

    private String nomeDoTitular;
    private double saldo;
    private int numeroDaConta;

    public void depositar(double valorDeposito) {
        setSaldo(getSaldo() + valorDeposito);
        System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Valor depositado com sucesso: R$ " + valorDeposito + " O saldo atual é de: R$" + getSaldo());
    }

    public void sacar(double valorSacado) {
        if ((valorSacado) > getSaldo()) {
            System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Não é possível efetuar o saque, pois o saldo ficará negativo em: R$ " + (getSaldo() - valorSacado));
        } else {
            setSaldo(getSaldo() - valorSacado);
            System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Valor sacado com sucesso: R$ " + valorSacado + " O saldo atual é de: R$" + getSaldo());
        }
    }

    public void transferir(double valorTransferido, conta contaSaida, conta contaEntrada) {
        if ((valorTransferido) > getSaldo()) {
            System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Não é possível efetuar a transferência, pois o saldo ficará negativo em: R$ " + (getSaldo() - valorTransferido));
        } else {
            contaSaida.setSaldo(getSaldo() - valorTransferido);
            contaEntrada.setSaldo(getSaldo() + valorTransferido);
            System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Valor transferido com sucesso: R$ " + valorTransferido + " O saldo atual é de: R$" + contaSaida.getSaldo());
        }
    }

    public void verSaldo() {
        System.out.println("O saldo atual da conta número "+getNumeroDaConta()+".Titular: "+getNomeDoTitular()+", é de: R$ " + getSaldo());
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

}
