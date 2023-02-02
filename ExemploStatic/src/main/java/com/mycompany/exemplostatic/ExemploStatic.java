package com.mycompany.exemplostatic;

public class ExemploStatic {

    public static void main(String[] args) {
        String texto = "TEstando A FUNCAO de alterar string.";
        texto = utilitario.deixarEmMaiusculo(texto);

        System.out.println(texto);
        
        texto = utilitario.deixarEmMinusculo(texto);
        System.out.println(texto);

    }
}
