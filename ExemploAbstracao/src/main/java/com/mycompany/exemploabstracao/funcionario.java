package com.mycompany.exemploabstracao;

public class funcionario extends pessoa{
    private int cracha;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    @Override
    public void imprime() {
        System.out.println("O Funcionário "+getNome()+" tem "+getIdade()+" anos e possui o crachá numero: "+getCracha());
    }
    
}
