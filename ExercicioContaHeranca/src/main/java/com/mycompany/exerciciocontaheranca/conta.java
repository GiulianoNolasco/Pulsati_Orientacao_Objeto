package com.mycompany.exerciciocontaheranca;

public class conta {

    private String numero;
    private String cliente;
    private double saldo;

    public void depositar(double valorDeposito) {
        setSaldo(getSaldo() + valorDeposito);
        System.out.println("Valor depositado com sucesso: R$ " + valorDeposito + " O saldo atual é de: R$" + getSaldo());

    }

    public void sacar(double valorSacado) {
        if ((valorSacado) > getSaldo()) {
            System.out.println("Não é possível efetuar o saque, pois o saldo ficará negativo em: R$ " + (getSaldo() - valorSacado));
        } else {
            setSaldo(getSaldo() - valorSacado);
            System.out.println("Valor sacado com sucesso: R$ " + valorSacado + " O saldo atual é de: R$" + getSaldo());
        }
    }

    public void verSaldo() {
        System.out.println("O saldo atual da conta é de: R$ " + getSaldo());
    }

    public void sacar() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
