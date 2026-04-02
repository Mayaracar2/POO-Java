package br.inatel.poo.aula8_poo;

public class Conta {
    //Atributos
    public double saldo;
    public int numero;
    public double limite;
    public Cliente titular;

    //métodos
    public void deposito(double quantia){
        this.saldo += quantia;
    }

    public void saque(double quantia){
        this.saldo -= quantia;
    }

    public void  transferir(br.inatel.poo.aula7_poo.Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
