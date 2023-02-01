package com.mycompany.exercicio4pilares2contabancaria;

public class contaEspecial extends conta {

    private double limite;

    public void depositar(double valorDeposito) {
        setSaldo(getSaldo() + valorDeposito);
        System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Valor depositado com sucesso: R$ " + valorDeposito + " O saldo atual é de: R$" + getSaldo() + "O limite atual é de: R$" + getLimite());
    }

    public void sacar(double valorSacado) {
        if ((valorSacado) > (getSaldo() + getLimite())) {
            System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Não é possível efetuar o saque, pois o saldo ficará negativo em: R$ " + (getSaldo() - valorSacado));
        } else {
            setSaldo(getSaldo() - valorSacado);
            System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Valor sacado com sucesso: R$ " + valorSacado + " O saldo atual é de: R$" + getSaldo() + "O limite atual é de: R$" + getLimite());
        }
    }
 
    public void transferir(double valorTransferido, conta contaSaida, conta contaEntrada) {
        if ((valorTransferido) > (getSaldo() + getLimite())) {
            System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Não é possível efetuar a transferência, pois o saldo ficará em: R$ " + (getSaldo() - valorTransferido));
        } else {
            contaSaida.setSaldo(getSaldo() - valorTransferido);
            contaEntrada.setSaldo(getSaldo() + valorTransferido);
            System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": Valor transferido com sucesso: R$ " + valorTransferido + " O saldo atual é de: R$" + contaSaida.getSaldo() + "O limite atual é de: R$" + getLimite());
        }
    }

    public void verSaldo() {
                System.out.println("Conta número "+getNumeroDaConta()+". Titular "+getNomeDoTitular()+": O saldo atual da conta é de: R$ " + getSaldo()+ "O limite atual é de: R$" + getLimite());
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

}
