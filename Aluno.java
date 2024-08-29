import java.util.Scanner;

public class Aluno {
    int matricula;
    int np1;
    int np2;
    int periodo;
    String nome;

    Scanner entrada = new Scanner(System.in);

    public int calculaMedia()
    {
        System.out.println("NP1: ");
        np1 = entrada.nextInt();
        System.out.println("NP2: ");
        np2 = entrada.nextInt();
        int media;
        media = (np1 + np2) / 2;
        if(media >= 60){
            System.out.println("Aprovado");
        }
        else if(media < 30){
            System.out.println("Reprovado");
        }
        else{
            media = calculaNP3(media);
        }
        return media;
    }

    public int calculaNP3(int media){
        int np3;
        System.out.println("NP3: ");
        np3 = entrada.nextInt();
        media = (media + np3)/2;
        if(media >= 50){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
        return media;
    }

    public String toString(){
        return "String" + "\n" + "Nome: " + nome + "\n" + "Matricula: " + matricula + "\n" + "Periodo: "  +  periodo + "\n";
    }
}
