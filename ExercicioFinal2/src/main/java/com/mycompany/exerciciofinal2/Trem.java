package com.mycompany.exerciciofinal2;

public class Trem implements Transporte {

    private int distanciaEmKm;
    private int velocidadeTrem;

    @Override
    public void move(Transporte t) {
        System.out.println(t.calculaTempoViagem());
    }

    @Override
    public int calculaTempoViagem() {
        return (getDistanciaEmKm() / getVelocidadeTrem()  );
    }

    public int getDistanciaEmKm() {
        return distanciaEmKm;
    }

    public void setDistanciaEmKm(int distanciaEmKm) {
        this.distanciaEmKm = distanciaEmKm;
    }

    public int getVelocidadeTrem() {
        return velocidadeTrem;
    }

    public void setVelocidadeTrem(int velocidadeTrem) {
        this.velocidadeTrem = velocidadeTrem;
    }

}
