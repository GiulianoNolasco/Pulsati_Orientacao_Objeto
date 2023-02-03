package com.mycompany.exerciciofinal2;

public class Aviao implements Transporte {

    private int distanciaEmKm;
    private int velocidadeAviao;

    @Override
    public void move(Transporte t) {
        System.out.println(t.calculaTempoViagem());
    }

    @Override
    public int calculaTempoViagem() {
        return (getDistanciaEmKm() / getVelocidadeAviao());
    }

    public int getDistanciaEmKm() {
        return distanciaEmKm;
    }

    public void setDistanciaEmKm(int distanciaEmKm) {
        this.distanciaEmKm = distanciaEmKm;
    }

    public int getVelocidadeAviao() {
        return velocidadeAviao;
    }

    public void setVelocidadeAviao(int velocidadeAviao) {
        this.velocidadeAviao = velocidadeAviao;
    }

}
