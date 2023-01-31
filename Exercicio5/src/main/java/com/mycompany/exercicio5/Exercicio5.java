/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio5;

/**
 *
 * @author giuliano.santos
 */
public class Exercicio5 {

    public static void main(String[] args) {
        carro Fusca = new carro();
        Fusca.litrosTanque = 40;
        Fusca.montadora = "Ford";
        
        carro Palio = new carro();
        Palio.litrosTanque = 180;
        Palio.montadora = "Chevrolet";
        
        Palio.imprimeCarro();
        Fusca.imprimeCarro();
        
    }
}
