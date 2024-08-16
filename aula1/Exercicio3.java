import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("NP1: ");
        int NP1 = entrada.nextInt();
        System.out.println("NP2: ");
        int NP2 = entrada.nextInt();

        if((NP1 + NP2)/2 >= 60) {
            System.out.println("Aprovado");
        }
        else if (((NP1 + NP2)/2 < 60) && (NP1 + NP2)/2 >= 30) {
            System.out.println("Fazer NP3");
        }
        else {
            System.out.println("Reprovado");
        }

        System.out.println("NP3: ");
        int NP3 = entrada.nextInt();

        if(((NP1 + NP2)/2) + NP3 >= 50) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Reprovado");
        }
    }
}
