
package com.mycompany.exercicioencapsulamento2;

public class aluno {
    private String nome;
    private double nota;

    public void imprimeNota(){
        System.out.println("O aluno "+getNome()+ " tirou nota "+getNota());
    } 
            
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
}
