public class Zumbi {
    double Vida;
    String Nome;
    //double dano;

    /*
    //Metodo se alimentar
    void seAlimentar(){
        System.out.println("O zumbi " + this.Nome + " esta se alimentando");
    }
    */

    //Metodo mostra vida
    double MostraVida(){
        return Vida;
    }

    //Metodo transferencia de vida
    void transfereVida(Zumbi zumbiAlvo, double quantia){
        Vida -= quantia;
        zumbiAlvo.Vida += quantia;
    }

    /*
    //Metodo da dano
    void tiraVida(Zumbi zumbiAlvo,double quantia){
        Vida -= quantia;
    }
    */
}
