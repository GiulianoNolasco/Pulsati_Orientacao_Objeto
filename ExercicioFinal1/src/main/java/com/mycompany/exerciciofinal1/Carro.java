package com.mycompany.exerciciofinal1;

public class Carro implements Veiculo {

    private int velocidadeCarro;
    private int marchaCarro;

    Carro() {
        setVelocidadeCarro(Veiculo.velocidadeInicial);
    }

    public int getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public void setVelocidadeCarro(int velocidadeCarro) {
        this.velocidadeCarro = velocidadeCarro;
    }

    @Override
    public void acelerar() {
        setVelocidadeCarro(getVelocidadeCarro() + 10);
        System.out.println("Veículo acelerou.");

    }

    @Override
    public void frear() {
        setVelocidadeCarro(getVelocidadeCarro() - 10);
        System.out.println("Veículo freou.");

    }

    @Override
    public void velocidadeAtual() {
        System.out.println("A velocidade atual do é de: " + getVelocidadeCarro());
    }

    @Override
    public void mudarMarcha(int alteracao) {
        if ((getMarchaCarro() + alteracao) > 5 || (getMarchaCarro() + alteracao) < 0) {
            System.out.println("Alteração não permitida, fora do padrão 0 até 5.");
        } else {
            setMarchaCarro(getMarchaCarro() + alteracao);
            System.out.println("Marcha alterou: " + alteracao + ". Marcha atual é:" + getMarchaCarro());

        }
    }

    public int getMarchaCarro() {
        return marchaCarro;
    }

    public void setMarchaCarro(int marchaCarro) {
        this.marchaCarro = marchaCarro;
    }
}
