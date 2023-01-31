package com.mycompany.exerciciocontaheranca;

public class ExercicioContaHeranca {

    public static void main(String[] args) {
        conta cliente1 = new conta();
        cliente1.setCliente("José da Silva");
        cliente1.setNumero("124.587.4");
        cliente1.setSaldo(1500.00);

        cliente1.verSaldo();
        cliente1.depositar(500.00);
        cliente1.sacar(1500.00);
        cliente1.sacar(1500.00);
        cliente1.verSaldo();

        System.out.println("____________________________________________");
        System.out.println("____________________________________________");

        contaEspecial clienteEspecial = new contaEspecial();
        clienteEspecial.setCliente("Dietmar Vontrabischevizk");
        clienteEspecial.setNumero("5.8");
        clienteEspecial.setSaldo(20000.00);
        clienteEspecial.setLimite(30000);

        clienteEspecial.verSaldo();
        clienteEspecial.depositar(5000.00);
        clienteEspecial.sacar(30000.00);
        clienteEspecial.sacar(30000.00);
        clienteEspecial.verSaldo();

    }
}
