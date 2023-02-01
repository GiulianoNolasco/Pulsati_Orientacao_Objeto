package com.mycompany.exercicio4pilares;

public abstract class veiculo {
    private int velocidade;
    private int quantidadePassageiros;
    
    public abstract void imprime();

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getQuantidadePAssageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePAssageiros(int quantidadePAssageiros) {
        this.quantidadePassageiros = quantidadePAssageiros;
    }
    

}
