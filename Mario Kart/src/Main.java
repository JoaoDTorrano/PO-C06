public class Main {
    public static void main(String[] args) {
        Kart kart1 = new Kart();
        Kart kart2 = new Kart();
        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        kart1.piloto =  piloto1;
        kart2.piloto = piloto2;

        kart1.Nome = "Ferrari";
        kart2.Nome = "Kick";

        kart1.piloto.nome = "Mario";
        kart2.piloto.nome = "Wario";

        kart1.piloto.vilao = false;
        kart2.piloto.vilao = true;

        kart1.motor.cilindradas = "50";
        kart1.motor.velocidadeMaxima = 100;

        kart2.motor.velocidadeMaxima = 150;
        kart2.motor.cilindradas = "100";

        System.out.println("infos do kart 1");
        kart1.motor.mostrainfo();

        System.out.println("infos do kart 2");
        kart2.motor.mostrainfo();

        System.out.println("Movimentos do kart1: ");
        kart1.pular();
        kart1.fazerDrift();
        kart1.soltarTurbo();
        kart1.piloto.soltaSuperPoder();

        System.out.println("Movimentos do kart2: ");
        kart2.pular();
        kart2.fazerDrift();
        kart2.soltarTurbo();
        kart2.piloto.soltaSuperPoder();

    }
}
