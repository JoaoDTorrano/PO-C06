import java.util.Random;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner entrada = new Scanner(System.in);
        int Numero;
        int x = rand.nextInt(10) + 1;
        int distancia;
        System.out.println("Adivinhe o numero(Entre 1 a 10):");
        do{
            Numero = entrada.nextInt();
            if(Numero != x){
                distancia = x - Numero;
                if(distancia > 0){
                    System.out.println(distancia + " numeros abaixo do numero gerado");
                }
                else{
                    System.out.println(distancia*-1 + " numeros acima do numero gerado");
                }
            }
        }while(Numero != x);

        System.out.println("Acertou!");
    }
}
