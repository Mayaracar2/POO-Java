package br.inatel.poo.aula13_banco;

public class main {
    public static void main (String[] args){
        Conta conta = new Conta();

        System.out.println(conta.saldo);

        conta.saque(1000);

        System.out.println(conta.saldo);

        conta.saldo = 2000;


    }
}
