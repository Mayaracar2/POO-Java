package org.aula7_poo;

public class Conta {
    //Atributos
    public double saldo;
    public int numero;
    public double limite;
    public String nomeDono;

    //métodos
    public void deposito(double quantia){
        this.saldo += quantia;
    }

    public void saque(double quantia){
        this.saldo -= quantia;
    }

    public void  transferir(Conta contaDestino, double quantia){
        this.saldo -= quantia;
        contaDestino.saldo += quantia;
    }
}
