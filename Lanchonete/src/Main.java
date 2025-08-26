public class Main {

    public static void main(String[] args) {

        Cantina cantina = new Cantina();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();
        Salgado salgado3 = new Salgado();

        cantina.nome = "Zé lanches";
        salgado1.nome = "Coxinha";
        salgado2.nome = "Esfirra";
        salgado3.nome = "Humburgão";

        cantina.addSalgados(salgado1);
        cantina.addSalgados(salgado2);
        cantina.addSalgados(salgado3);

        cantina.mostraInfo();

    }

}
