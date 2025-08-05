import java.util.Random;
import java.util.Scanner;

public class Exercico6 {
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
                if(x > y){
                    System.out.println("O Numero é o maior que o digitado");
                }
                else{
                    System.out.println("O numero é menor que o digitado");
                }
            }
        }while(x != y);
    }
}
