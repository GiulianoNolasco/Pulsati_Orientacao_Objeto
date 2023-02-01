package com.mycompany.exercicio4pilares;

public class aviao extends veiculo {

    private int tamanhoAsa;
    private int tamanhoPistaPouso;

    @Override
    public void imprime() {
        System.out.println("O avião possui velocidade máxima de " + getVelocidade());
        System.out.println("Comporta " + getQuantidadePAssageiros() + " passageiros.");
        System.out.println("Tem asa no tamanho " + getTamanhoAsa());
        System.out.println("Necessita de pista de pouso no tamanho: " + getTamanhoPistaPouso());

    }

    public int getTamanhoAsa() {
        return tamanhoAsa;
    }

    public void setTamanhoAsa(int tamanhoAsa) {
        this.tamanhoAsa = tamanhoAsa;
    }

    public int getTamanhoPistaPouso() {
        return tamanhoPistaPouso;
    }

    public void setTamanhoPistaPouso(int tamanhoPistaPouso) {
        this.tamanhoPistaPouso = tamanhoPistaPouso;
    }

}
