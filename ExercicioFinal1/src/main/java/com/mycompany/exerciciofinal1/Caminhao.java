package com.mycompany.exerciciofinal1;

public class Caminhao implements Veiculo {

    private int velocidadecaminhao;
    private int marchaCaminhao;

    Caminhao() {
        setVelocidadecaminhao(Veiculo.velocidadeInicial);
    }

    @Override
    public void acelerar() {
        setVelocidadecaminhao(getVelocidadecaminhao() + 10);
        System.out.println("Veículo acelerou.");

    }

    @Override
    public void frear() {
        setVelocidadecaminhao(getVelocidadecaminhao() - 10);
        System.out.println("Veículo freiou.");

    }

    @Override
    public void velocidadeAtual() {
        System.out.println("A velocidade atual do " + getClass() + "é de: " + getVelocidadecaminhao());
    }

    public int getVelocidadecaminhao() {
        return velocidadecaminhao;
    }

    public void setVelocidadecaminhao(int velocidadecaminhao) {
        this.velocidadecaminhao = velocidadecaminhao;
    }

    @Override
    public void mudarMarcha(int alteracao) {
        if ((getMarchaCaminhao() + alteracao) > 5 || (getMarchaCaminhao() + alteracao) < 0) {
            System.out.println("Alteração não permitida, fora do padrão 0 até 6.");
        } else {
            setMarchaCaminhao(getMarchaCaminhao() + alteracao);
            System.out.println("Marcha alterou: " + alteracao + ". Marcha atual é:" + getMarchaCaminhao());
        }
    }

    public int getMarchaCaminhao() {
        return marchaCaminhao;
    }

    public void setMarchaCaminhao(int marchaCaminhao) {
        this.marchaCaminhao = marchaCaminhao;
    }

}
