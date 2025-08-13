public class Conta {
    //Membros da Classe
    int numero;
    String nomeDoDono;
    float saldo;
    float limite;

    //Metodos

    //Metodo para depositar
    void deposita(float quantia){

        saldo += quantia;
    }

    //Metodo para sacar
    void saca(float quantia){

        float novoSaldo = saldo - quantia;
        saldo = novoSaldo;
    }

    //Metodo para transferir
    void transferir(Conta contaDestino, float quantia){
        saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
