import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zumbi zumbi = new Zumbi();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Zumbi tipo: ");
        zumbi.Tipo = entrada.nextLine();

        if(zumbi.Tipo.equalsIgnoreCase("corredor")) {
            zumbi.Vida = 30;
            zumbi.Vigor = 100;
            zumbi.Dano = 6;
            System.out.println(zumbi.Habilidades());
            System.out.println("Vida: " + zumbi.Vida);
            System.out.println("Vigor: " + zumbi.Vigor);
            System.out.println("Dano: " + zumbi.Dano);
        }
        else if(zumbi.Tipo.equalsIgnoreCase("tanke")){
            zumbi.Vida = 100;
            zumbi.Vigor = 30;
            zumbi.Dano = 20;
            System.out.println(zumbi.Habilidades());
            System.out.println("Vida: " + zumbi.Vida);
            System.out.println("Vigor: " + zumbi.Vigor);
            System.out.println("Dano: " + zumbi.Dano);
        }
        else if(zumbi.Tipo.equalsIgnoreCase("normal")){
            zumbi.Vida = 50;
            zumbi.Vigor = 50;
            zumbi.Dano = 10;
            System.out.println(zumbi.Habilidades());
            System.out.println("Vida: " + zumbi.Vida);
            System.out.println("Vigor: " + zumbi.Vigor);
            System.out.println("Dano: " + zumbi.Dano);
        }
        else{
            System.out.println(zumbi.Habilidades());
            System.out.println("Vida: " + "Desconhecido");
            System.out.println("Vigor: " + "Desconhecido");
            System.out.println("Dano: " + "Desconhecido");

        }
    }
}
