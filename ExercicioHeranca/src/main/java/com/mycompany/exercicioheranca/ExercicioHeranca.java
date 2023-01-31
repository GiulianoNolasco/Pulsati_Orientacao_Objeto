package com.mycompany.exercicioheranca;

public class ExercicioHeranca {

    public static void imprimeQtPassageiros(veiculo v){
        System.out.println("Quantidade de passageiros "+ v.getQuantidadePassageiros());}
    
    public static void main(String[] args) {
    aviao objetoAviao = new aviao();
    moto objetoMoto = new moto();
    
      objetoAviao.setQuantidadePassageiros(120);
      objetoMoto.setQuantidadePassageiros(2);
      
        imprimeQtPassageiros(objetoMoto);
        imprimeQtPassageiros(objetoAviao);
    }
}
