package com.mycompany.exerciciofinal1;

public class Bicicleta implements Veiculo {

    private int velocidadebicicleta;

    Bicicleta() {
        setVelocidadebicicleta(Veiculo.velocidadeInicial);
    }

    public int getVelocidadebicicleta() {
        return velocidadebicicleta;
    }

    public void setVelocidadebicicleta(int velocidadebicicleta) {
        this.velocidadebicicleta = velocidadebicicleta;
    }

    @Override
    public void acelerar() {
        setVelocidadebicicleta(getVelocidadebicicleta() + 10);
        System.out.println("Veículo acelerou.");

    }

    @Override
    public void frear() {
        setVelocidadebicicleta(getVelocidadebicicleta() - 10);
        System.out.println("Veículo freou.");

    }

    @Override
    public void velocidadeAtual() {
        System.out.println("A velocidade atual do " + getClass() + "é de: " + getVelocidadebicicleta());
    }

    @Override
    public void mudarMarcha(int alteracao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
