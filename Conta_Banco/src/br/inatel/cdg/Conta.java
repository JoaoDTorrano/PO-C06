package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente[] cliente;

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public Conta(){
        setCliente(new Cliente[3]);
    }

    public void sacar(float quantia){
        if(saldo >= quantia){
            this.saldo -= quantia;
        }
        else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(float quantia){
        this.saldo += quantia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }
}
