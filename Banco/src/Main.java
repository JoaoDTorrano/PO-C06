public class Main {
    public static void main(String[] args) {

        //Criando uma nova instancia de Comnta!
        //E atribuindo a uma variável do tipo Conta!
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.nomeDoDono = "Jaum";
        c1.limite = 1000;
        c1.numero= 1234;
        c1.saldo = 2000;

        c2.nomeDoDono = "Jaum";
        c2.limite = 1000;
        c2.numero= 1234;
        c2.saldo = 2000;

        /*System.out.println("O dono da classe eh: " + c.nomeDoDono + "e o saldo eh: " + c.saldo);

        //Depositando R$ 100,00
        c.deposita(100);
        System.out.println(c.saldo);

        //Sacando R$ 50,00
        c.saca(50);
        System.out.println(c.saldo);
         */

        c1.transferir(c2,100);
        System.out.println("O Saldo de C1 é: " + c1.saldo);
        System.out.println("O saldo de C2 é: " + c2.saldo);
    }
}