package br.inatel.poo.aula7_poo;

public class main {
   public static void main (String[] args){

       Conta contaCorrente = new Conta();

       contaCorrente.saldo = 1000;
       contaCorrente.nomeDono = "Fernando";

       /*System.out.println("Conta de " + contaCorrente.nomeDono + " possui R$ " + contaCorrente.saldo);

       contaCorrente.deposito(250);
       System.out.println("Conta de " + contaCorrente.nomeDono + " possui R$ " + contaCorrente.saldo);

       contaCorrente.saque(70);
       System.out.println("Conta de " + contaCorrente.nomeDono + " possui R$ " + contaCorrente.saldo);*/

       System.out.println("_______________________________________________________________________");

       Conta contaCorrente2 = new Conta();
       contaCorrente2.saldo = 3500;
       contaCorrente2.nomeDono = "Sarah";

       /*System.out.println("Conta de " + contaCorrente2.nomeDono + " possui R$ " + contaCorrente2.saldo);

       contaCorrente2.deposito(250);
       System.out.println("Conta de " + contaCorrente2.nomeDono + " possui R$ " + contaCorrente2.saldo);

       contaCorrente2.saque(70);
       System.out.println("Conta de " + contaCorrente2.nomeDono + " possui R$ " + contaCorrente2.saldo);*/

       // contaCorrente = contaCorrente2; //Somente quando eu faço isso, elas passam a ser iguais, pois significa que estou ajustando o valor

       /*if (contaCorrente == contaCorrente2) //variáveis complexas
           System.out.println("Iguais");
       else
           System.out.println("Diferentes");

       int x = 10;
       int y = 10;

       if (x == y)
           System.out.println("X e Y são iguais");*/

       contaCorrente.transferir(contaCorrente2,55);
       System.out.println("Conta de " + contaCorrente.nomeDono + " possui R$ " + contaCorrente.saldo);
       System.out.println("Conta de " + contaCorrente2.nomeDono + " possui R$ " + contaCorrente2.saldo);

   }
}
