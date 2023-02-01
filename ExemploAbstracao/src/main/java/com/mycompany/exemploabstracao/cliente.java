package com.mycompany.exemploabstracao;

public class cliente extends pessoa{
    private int codigoCliente;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void imprime() {
                System.out.println("O Cliente "+getNome()+" tem "+getIdade()+" anos e possui o código: "+getCodigoCliente());

    }
}
