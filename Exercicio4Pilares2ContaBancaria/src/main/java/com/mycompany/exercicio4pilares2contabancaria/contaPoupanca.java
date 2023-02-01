package com.mycompany.exercicio4pilares2contabancaria;

public class contaPoupanca extends conta {

    private double taxaRendimento;

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
            System.out.println("Não é possível efetuar a transferência, pois o saldo ficará negativo em: R$ " + (getSaldo() - valorTransferido));
        } else {
            contaSaida.setSaldo(getSaldo() - valorTransferido);
            contaEntrada.setSaldo(getSaldo() + valorTransferido);
            System.out.println("Valor transferido com sucesso: R$ " + valorTransferido + " O saldo atual é de: R$" + contaSaida.getSaldo());
        }
    }

    public void gerarRendimentoMensal(contaPoupanca cta) {
        double saldoAtualizado = cta.getSaldo() * cta.getTaxaRendimento();
        System.out.println("O saldo atual é de R$  " + cta.getSaldo() + ". com o rendimento mensal o saldo é R$ :" + saldoAtualizado);
        cta.setSaldo(saldoAtualizado);
    }

    public void verSaldo() {
        System.out.println("O saldo atual da conta número "+getNumeroDaConta()+".Titular: "+getNomeDoTitular()+", é de: R$ " + getSaldo());
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }
}
