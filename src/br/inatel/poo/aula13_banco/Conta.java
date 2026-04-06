package br.inatel.poo.aula13_banco;

public class Conta {
    public double saldo;
    public int numero;
    public double limite;
    public Cliente titular;

    public void saque (double quantia){
        if (this.saldo > quantia)
          this.saldo -= quantia;
        else
            System.out.println("Saldo insuficiente");
    }
}
