package com.mycompany.exercicioconstrutor1;

public class contato {

    private int numeroCelular;
    private String email;

    private pessoa pessoaContato;
    private endereco enderecoContato;

    contato() {
        pessoaContato = new pessoa();
        enderecoContato = new endereco();
    }

    public void adicionaInformacoesPessoaEEndereco(String nome, int idade, String rua, int numero, int cep, int numeroCelular, String email) {
        pessoaContato.setIdade(idade);
        pessoaContato.setNome(nome);
        enderecoContato.setCep(cep);
        enderecoContato.setNumero(numero);
        enderecoContato.setRua(rua);
        this.numeroCelular = numeroCelular;
        this.email = email;
    }

    public void imprime() {
        String Mensagem = pessoaContato.getNome() + ", " + pessoaContato.getIdade() + " Anos.";
        Mensagem += "\n Endereço: " + enderecoContato.getRua() + ", número: " + enderecoContato.getNumero() + " CEP: " + enderecoContato.getCep();
        Mensagem += "\n E-mail: " + getEmail() + " e o telefone: " + getNumeroCelular();
        System.out.println(Mensagem);
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
