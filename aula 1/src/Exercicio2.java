import java.util.Scanner;

public class Exercicio2 {

        public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o numero de lanches 1: ");
            int lanche1 = entrada.nextInt();
            System.out.print("Digite o numero de lanches 2: ");
            int lanche2 = entrada.nextInt();
            System.out.print("Digite o numero de lanches 3: ");
            int lanche3 = entrada.nextInt();

            int total = lanche1 + lanche2 + lanche3;
            int media = total / 3;

            System.out.println("Total de lanches: " + total);
            System.out.println("Total de Media: " + media);
            entrada.close();
        }

}
