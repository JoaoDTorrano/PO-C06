import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Nota da NP1: ");
        int NP1 = entrada.nextInt();
        System.out.println("Nota da NP2: ");
        int NP2 = entrada.nextInt();

        int total = NP1 + NP2;
        int NPA = total /2;

        if(NPA >= 60){
            System.out.println("Passou!");
        }
        else if(NPA >= 30 && NPA < 60){
            System.out.println("Realizar NP3!");
            System.out.println("NPA igual a " + NPA);
            System.out.println("Nota da Np3: ");
            int NP3 = entrada.nextInt();

            int NPF = (NPA + NP3) / 2;

            if(NPF >= 50){
                System.out.println("Passou!");
            }
            else{
                System.out.println("Reprovou!");
            }

        }
        else{
            System.out.println("Reprovou!");
        }
    }
}
