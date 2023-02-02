package com.mycompany.exerciciofinal1;

public class SedanExercicio2 extends CarroExercicioDois {
    
    private int velocidadeCarro2;
    private int potenciaEmCavalos;
    
    SedanExercicio2(int potenciaEmCavalos, String marca) {
        setPotenciaEmCavalos(potenciaEmCavalos);
        setMarca(marca);
        setVelocidade(0);
    }
    
    public void acelerar() {
        setVelocidadeCarro2(getVelocidadeCarro2() + ((getPotenciaEmCavalos() / 10)));
        System.out.println("Veículo acelerou.");
    }
    
    public void frear() {
        setVelocidadeCarro2(getVelocidadeCarro2() - ((getPotenciaEmCavalos() / 10)));
        System.out.println("Veículo freou.");
    }
    
    public void velocidadeAtual() {
        System.out.println("A velocidade atual do é de: " + getVelocidadeCarro2());
    }
    
    public int getVelocidadeCarro2() {
        return velocidadeCarro2;
    }
    
    public void setVelocidadeCarro2(int velocidadeCarro2) {
        this.velocidadeCarro2 = velocidadeCarro2;
    }
    
    public int getPotenciaEmCavalos() {
        return potenciaEmCavalos;
    }
    
    public void setPotenciaEmCavalos(int potenciaEmCavalos) {
        this.potenciaEmCavalos = potenciaEmCavalos;
    }
    
}
