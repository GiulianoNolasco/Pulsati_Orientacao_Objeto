package com.mycompany.exercicioheranca;

public class aviao extends veiculo {
    private int quantidadeDePorta;
    private int quantidadeDeJanela;

    public int getQuantidadeDePorta() {
        return quantidadeDePorta;
    }

    public void setQuantidadeDePorta(int quantidadeDePorta) {
        this.quantidadeDePorta = quantidadeDePorta;
    }

    public int getQuantidadeDeJanela() {
        return quantidadeDeJanela;
    }

    public void setQuantidadeDeJanela(int quantidadeDeJanela) {
        this.quantidadeDeJanela = quantidadeDeJanela;
    }
}