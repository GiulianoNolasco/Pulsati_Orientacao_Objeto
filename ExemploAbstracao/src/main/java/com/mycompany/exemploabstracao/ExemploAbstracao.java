package com.mycompany.exemploabstracao;

public class ExemploAbstracao {

    public static void imprimePessoa(pessoa param){
    param.imprime();
    }
    
    public static void main(String[] args) {
        funcionario f1 = new funcionario();
        f1.setNome("Silva");
        f1.setIdade(74);
        f1.setCracha(241);
        
        cliente c1 = new cliente();
        c1.setNome("Figueiredo");
        c1.setIdade(80);
        c1.setCodigoCliente(674);
        
        imprimePessoa(c1);
        imprimePessoa(f1);
    }
}
