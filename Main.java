
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.nome = "Joao";
        aluno.matricula = 276;
        aluno.periodo = 4;

        System.out.println(aluno.calculaMedia());
        System.out.println(aluno.toString());
    }
 }