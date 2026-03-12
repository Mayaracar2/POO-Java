package org.aula6_poo;

public class Conta {
    //Atributo
    public double saldo;
    public double limite;
    public int agencia;
    public int numeroConta;

    //Métodos
    public void deposita(double quantia){
        this.saldo += quantia;
    }

    public void saca(double quantia){
        this.saldo -= quantia;
    }

}
