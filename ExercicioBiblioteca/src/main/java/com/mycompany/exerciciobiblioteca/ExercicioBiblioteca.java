        /* Sistema de gerenciamento de biblioteca: 

        Crie uma classe abstrata "Item" para representar um item na biblioteca: 
        com atributos como "título", "autor" e "número de exemplares".
        Em seguida, crie outras duas classes que herdam de "Item":
        classe livro Livro(INT ISBN, int numPaginas )
        classe Revista (int numEdicao)
        Crie tambem uma classe biblioteca:Metodos:   AlugarItem, que recebe um item, e mostra uma mensagem dizendo (item.titulo   " foi alugado") exemplo: "É assim que acaba foi alugado"   DevolverrItem, que recebe um item, e mostra uma mensagem dizendo (item.titulo   " foi devolvido") exemplo: "É assim que acaba foi devolvido"
         */
package com.mycompany.exerciciobiblioteca;

public class ExercicioBiblioteca {

    public static void main(String[] args) {

        biblioteca b1 = new biblioteca();

        livro livro1 = new livro();
        livro1.setTitulo("A volta dos que não foram");
        livro1.setNumeroDeExemplares(1);

        revista r1 = new revista();
        r1.setTitulo("As longas tranças de um careca");
        r1.setNumeroDeExemplares(3);

        //teste livro1
        b1.ConsultarNRExemplares(livro1);
        b1.AlugarItem(livro1);
        b1.ConsultarNRExemplares(livro1);
        b1.AlugarItem(livro1);
        b1.DevolverItem(livro1);
        b1.ConsultarNRExemplares(livro1);

        //teste revista1
        b1.ConsultarNRExemplares(r1);
        b1.AlugarItem(r1);
        b1.ConsultarNRExemplares(r1);
        b1.AlugarItem(r1);
        b1.AlugarItem(r1);
        b1.AlugarItem(r1);
        b1.ConsultarNRExemplares(r1);
        b1.DevolverItem(r1);
        b1.ConsultarNRExemplares(r1);

    }

}
