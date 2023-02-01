package com.mycompany.exercicio4pilares;

public class moto extends veiculo {
private int densidadeDoCapacete;
private int volumeBuzina;

    @Override
    public void imprime() {

        System.out.println("A moto possui velocidade máxima de " + getVelocidade());
        System.out.println("Comporta " + getQuantidadePAssageiros() + " passageiros.");
        System.out.println("Tem uma buzina no volume " + getVolumeBuzina());
        System.out.println("Necessita de um capacete na densidade: " + getDensidadeDoCapacete());
    }

    public int getDensidadeDoCapacete() {
        return densidadeDoCapacete;
    }

    public void setDensidadeDoCapacete(int densidadeDoCapacete) {
        this.densidadeDoCapacete = densidadeDoCapacete;
    }

    public int getVolumeBuzina() {
        return volumeBuzina;
    }

    public void setVolumeBuzina(int volumeBuzina) {
        this.volumeBuzina = volumeBuzina;
    }

}
