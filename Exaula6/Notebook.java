package br.inatel.Exaula6;

public class Notebook extends Produto {
    double armazenamento;
    String gpu;
    String processador;

    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador){
        super(nome,preco);
        this.armazenamento = armazenamento;
        this.gpu = gpu;
        this.processador = processador;
    }

    @Override
    public String etiquetaPreco(){
        return super.etiquetaPreco() + " armazenamento = " + armazenamento + " gpu = " + gpu + " processador = " + processador;
    }
}
