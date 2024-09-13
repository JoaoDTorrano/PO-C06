package br.inatel.Exaula6;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Notebook("ASUS", 5000, 500, "RTX 3050", "I5 11th");
        Produto produto2 = new Camiseta("NIKE", 500, "Branca", "GG");
        Produto produto3 = new Produto("Garrafa terminca", 200);

        Produto[] carrinho = new Produto[3];

        carrinho[0] = produto1;
        carrinho[1] = produto2;
        carrinho[2] = produto3;

        for(Produto escolhido: carrinho){
            if(escolhido instanceof Notebook){
               System.out.println(produto1.etiquetaPreco());
            }
            else if(escolhido instanceof Camiseta){
                System.out.println(produto2.etiquetaPreco());
            }
            else if(escolhido instanceof Produto){
                System.out.println(produto3.etiquetaPreco());
            }
        }
    }
}
