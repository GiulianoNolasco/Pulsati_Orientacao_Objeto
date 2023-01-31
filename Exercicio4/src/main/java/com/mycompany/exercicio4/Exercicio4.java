/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4;

/**
 *
 * @author giuliano.santos
 */
public class Exercicio4 {

    public static void main(String[] args) {
        casa predio = new casa();
        casa mansao = new casa();
        
        predio.cor = "Cinza";
        predio.metrosQuadrados = 124;
        
        mansao.cor = "Rosa";
        mansao.metrosQuadrados = 875;
        
        mansao.imprimeCasa();
        predio.imprimeCasa();
    }
}
