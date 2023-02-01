package com.mycompany.exercicioconstrutor1;

public class ExercicioConstrutor1 {

    public static void main(String[] args) {
        contato CLIENTE = new contato();
        CLIENTE.adicionaInformacoesPessoaEEndereco("Alfredo", 60, "Rua dos idosos", 74, 89040300, 999885544, "alfredao@ig.com.br");
        
        CLIENTE.imprime();
    }
}
