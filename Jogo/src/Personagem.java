public class Personagem {
    String nome;
    int pontos;
    Arma arma;

    void usarArma() {
        System.out.println("Usou arma e perdeu 2 de resistencia");
        arma.resistencia = arma.resistencia - 2;
        System.out.println("Resistencia atual: " + arma.resistencia);
    }

    void tomarDano(){
        System.out.printf("Recebeu %d de dano\n", arma.poder);
        pontos = pontos - arma.poder;
        System.out.println("Pontos atual: " + pontos);
    }
}
