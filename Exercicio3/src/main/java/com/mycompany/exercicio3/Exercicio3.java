package com.mycompany.exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        aluno Giu = new aluno();
        Giu.nome = "Giuliano";
        Giu.nota = 9.78;
        
        aluno Bradley = new aluno();
        Bradley.nome = "Bradley";
        Bradley.nota = 4.75;
        
        Giu.imprimeAluno();
        Bradley.imprimeAluno();
                       
    }
}
