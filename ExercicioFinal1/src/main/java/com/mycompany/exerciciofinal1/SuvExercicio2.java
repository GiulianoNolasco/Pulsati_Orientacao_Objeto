package com.mycompany.exerciciofinal1;

public class SuvExercicio2 extends CarroExercicioDois {
    
    private int velocidadeCarro2;
    private int potenciaEmCavalos;
    
    public SuvExercicio2(int potenciaEmCavalos, String marca) {
        setPotenciaEmCavalos(potenciaEmCavalos);
        setMarca(marca);
        setVelocidade(0);
    }
    
    public void acelerar() {
        setVelocidadeCarro(getVelocidadeCarro() + (getPotenciaEmCavalos() / 10));
        System.out.println("Veículo acelerou.");
    }
    
    public void frear() {
        setVelocidadeCarro(getVelocidadeCarro() - ((getPotenciaEmCavalos() / 10)));
        System.out.println("Veículo freou.");
    }
    
    public void velocidadeAtual() {
        System.out.println("A velocidade atual do é de: " + getVelocidadeCarro());
    }
    
    public int getVelocidadeCarro() {
        return velocidadeCarro2;
    }
    
    public void setVelocidadeCarro(int velocidadeCarro) {
        this.velocidadeCarro2 = velocidadeCarro;
    }
    
    public int getPotenciaEmCavalos() {
        return potenciaEmCavalos;
    }
    
    public void setPotenciaEmCavalos(int potenciaEmCavalos) {
        this.potenciaEmCavalos = potenciaEmCavalos;
    }
}
