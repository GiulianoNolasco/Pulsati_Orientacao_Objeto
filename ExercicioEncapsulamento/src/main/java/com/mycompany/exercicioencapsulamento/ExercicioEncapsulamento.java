
package com.mycompany.exercicioencapsulamento;

public class ExercicioEncapsulamento {

    public static void main(String[] args) {
        carro objeto1 = new carro();
        objeto1.setCilindrada(1000);
        objeto1.setMontadora("Chery");
        objeto1.setPaisOrigem("França");
        
        System.out.println(objeto1.getPaisOrigem());
        
    }
}
