public class Main {
    public static void main(String[] args) {
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();

        z1.Vida = 100;
        z1.Nome = "Zooy";
       //z1.dano = 30;
        System.out.println("Nome do zumbi: " + z1.Nome);
        System.out.println(z1.MostraVida());

        z2.Vida = 150;
        z2.Nome = "Zobby";
        //z2.dano = 45;
        System.out.println("Nome do zumbi: " + z2.Nome);
        System.out.println(z2.MostraVida());


       // z1.seAlimentar();
        z1.transfereVida(z2,50);
        System.out.printf("O zumbi %s agora tem %.2f de vida %n", z1.Nome, z1.Vida);
        System.out.printf("O zumbi %s agora tem %.2f de vida %n", z2.Nome, z2.Vida);

        /*
        z2.tiraVida(z1,100);
        System.out.printf("O zumbi %s agora tem %.2f de vida %n", z2.Nome, z2.Vida);
         */
    }
}
