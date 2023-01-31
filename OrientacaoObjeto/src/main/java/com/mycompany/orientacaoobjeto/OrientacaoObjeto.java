
package com.mycompany.orientacaoobjeto;

public class OrientacaoObjeto {

    public static void main(String[] args) {
        carro objeto1 = new carro();
        objeto1.cilindrada = 1500;
        objeto1.cor = "vermelho";
        objeto1.montadora = "Ferrari";

        objeto1.imprimeCarro();

        carro objeto2 = new carro();
        objeto2.cilindrada = 2000;
        objeto2.cor = "amarelo";
        objeto2.montadora = "Fusca";
        objeto2.imprimeCarro();

    }
}
