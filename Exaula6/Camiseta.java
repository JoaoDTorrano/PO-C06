package br.inatel.Exaula6;

public class Camiseta extends Produto{
    String cor;
    String tamanho;

    public Camiseta(String nome, double preco, String cor, String tamanho){
        super(nome,preco);
        this.cor = cor;
        this.tamanho = tamanho;
    }

    @Override
    public String etiquetaPreco(){
        return super.etiquetaPreco() + " cor = " + cor + " tamanho + " + tamanho;
    }
}
