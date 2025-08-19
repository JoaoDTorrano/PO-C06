public class Main {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        //Personagem p2 = new Personagem();
        Arma arma = new Arma();
        //Arma arma2 = new Arma();

        personagem.nome = "Arthur";
        personagem.pontos = 100;

        personagem.arma = arma;
        //p2.arma = arma2;

        personagem.arma.nome = "Clover";
        personagem.arma.poder = 5;
        personagem.arma.resistencia = 10;
        personagem.arma.descricao = "Arma magica de um reino perdido";

        /*p2.arma.nome = "Real Guard";
        p2.arma.poder = 5;
        p2.arma.resistencia = 120;
        p2.arma.descricao = "Arma de uma familia real esquecida";
         */

        personagem.arma.mostraInfoArma();
        personagem.usarArma();
        personagem.tomarDano();



    }
}
