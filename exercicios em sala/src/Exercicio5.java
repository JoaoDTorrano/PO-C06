import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner entrada = new Scanner(System.in);
        int x = num.nextInt(10) + 1;
        int y;

        do{
            System.out.println("Adivinhe o numero de 1-10: ");
            y = entrada.nextInt();
            if(x == y){
                System.out.println("Acertou!");
            }
            else{
                System.out.println("Errou!");
            }
        }while(x != y);
    }
}
