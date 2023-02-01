package com.mycompany.exerciciobiblioteca;

public class biblioteca {

    
    public static void AlugarItem(item i) {
        if (i.getNumeroDeExemplares() < 1) {
            System.out.println(i.getTitulo() + " Não foi possível alugar, não está em estoque.");
        } else {
            i.setNumeroDeExemplares(i.getNumeroDeExemplares() - 1);
            System.out.println(i.getTitulo() + " foi alugado.");
        }
    }

    public static void DevolverItem(item i) {
        System.out.println(i.getTitulo() + " foi devolvido.");
        i.setNumeroDeExemplares(i.getNumeroDeExemplares() + 1);

    }

    public static void ConsultarNRExemplares(item i) {
        System.out.println("Número de exemplares: " + i.getNumeroDeExemplares() + " do item: " + i.getTitulo()+".");
    }

}
