import java.util.Random;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int Numero;
        int x = rand.nextInt(10) + 1;
        System.out.println("Adivinhe o numero(Entre 1 a 10):");
        do{
            Numero = entrada.nextInt();
        }while(Numero != x);

        System.out.println("Acertou!");
    }
}
