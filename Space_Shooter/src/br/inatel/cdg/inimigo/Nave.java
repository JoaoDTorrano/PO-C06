package br.inatel.cdg.inimigo;

import br.inatel.cdg.jogador.Asteroide;
import com.sun.security.jgss.GSSUtil;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public  Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }

    public void atirar(Asteroide ast){
        System.out.println(this.nome + " atirando no asteoride " + ast.getNome());
        if(this.tipoTiro == "Explosivo" && ast.getTipoAsteroide() == "Grande"){
            ast.destruir();
        }
        else if(this.tipoTiro == "Normal" && ast.getTipoAsteroide() == "Pequeno"){
            ast.destruir();
        }
        else{
            System.out.println("Asteroide te atingiu");
        }
    }

}
