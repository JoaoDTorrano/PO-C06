import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numAlunos = entrada.nextInt();

        switch (numAlunos) {
            case 10:
            case 20:
                System.out.println("Sala utilizada é a I-16");
                break;
            case 30:
                System.out.println("Sala utilizada é a I-22");
                break;
            default:
                System.out.println("Executando default");
        }
    }
}
