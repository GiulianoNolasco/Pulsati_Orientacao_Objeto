package com.mycompany.exercicio4pilares;

public class Exercicio4Pilares {
    
    public static void main(String[] args) {
        // criar uma classe veiculo com velocidade e quantidade passageiros e um metodo abstrato imprime
        // criar duas classes herdeiras, aviao e moto
        // encapsular os atributos de todas as classes
        // implementar o metodo imprime nas 2 classes filhas
        
        
        aviao dusty = new aviao();
        dusty.setQuantidadePAssageiros(4);
        dusty.setTamanhoAsa(10);
        dusty.setTamanhoPistaPouso(190);
        dusty.setVelocidade(340);
        
        dusty.imprime();
        
        System.out.println("");
        moto voaBaixo = new moto();
        voaBaixo.setDensidadeDoCapacete(80);
        voaBaixo.setQuantidadePAssageiros(2);
        voaBaixo.setVelocidade(160);
        voaBaixo.setVolumeBuzina(45);
        
        voaBaixo.imprime();
        
        
                
    }
}
