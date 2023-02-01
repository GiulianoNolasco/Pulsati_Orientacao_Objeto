package com.mycompany.exercicio4pilares2contabancaria;

public class Exercicio4Pilares2ContaBancaria {

    public static void main(String[] args) {

        /*
        Sistema de gerenciamento de contas:
        Crie uma classe "Conta" para representar uma conta bancária
        , com atributos como "nome do titular", "saldo" e "número da conta":
        Implemente métodos para depositar, sacar e transferir dinheiro entre contas. Em seguida, crie outras duas classes que herdam de "Conta":
        "ContaEspecial"(double Limite        )
        "ContaPoupanca"(double taxaRendimento
         */

        contaEspecial conta1 = new contaEspecial();
        conta1.setSaldo(5000);
        conta1.setNomeDoTitular("Primo rico");
        conta1.setNumeroDaConta(1);
        conta1.setLimite(1000);

        contaPoupanca conta2poupanca = new contaPoupanca();
        conta2poupanca.setNomeDoTitular("Enzo");
        conta2poupanca.setNumeroDaConta(2);
        conta2poupanca.setSaldo(500.57);
        conta2poupanca.setTaxaRendimento(0.10);

        conta1.depositar(500);
        conta1.sacar(60);
        conta1.sacar(600000);

        conta2poupanca.verSaldo();
        conta2poupanca.depositar(100);
        conta2poupanca.sacar(10);

        conta1.transferir(5000, conta1, conta2poupanca);

        conta2poupanca.verSaldo();
        conta1.verSaldo();
    }
}
