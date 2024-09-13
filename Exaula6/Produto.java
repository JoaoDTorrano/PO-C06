package br.inatel.Exaula6;

public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco(){
        return "nome = " + nome + " preco = " + preco;
    }
}
