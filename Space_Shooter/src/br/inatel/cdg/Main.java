package br.inatel.cdg;

import br.inatel.cdg.inimigo.Nave;
import br.inatel.cdg.jogador.Asteroide;

public class Main {
    public static void main(String[] args) {
        Asteroide ast1 = new Asteroide("N1","Pequeno");
        Asteroide ast2 = new Asteroide("N2","Grande");
        Asteroide ast3 = new Asteroide("N3","Pequeno");

        Nave jogador1 = new Nave("Star fox", 100, "Explosivo");
        Nave jogador2 = new Nave("Star crow", 150, "Normal");

        jogador1.atirar(ast1);
        jogador1.atirar(ast2);
        jogador1.atirar(ast3);

        jogador2.atirar(ast1);
        jogador2.atirar(ast2);
        jogador2.atirar(ast3);

    }
}
