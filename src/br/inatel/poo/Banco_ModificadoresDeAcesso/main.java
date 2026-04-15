package br.inatel.poo.Banco_ModificadoresDeAcesso;

public class main {
    public static void main (String[] args){
        Conta conta = new Conta();

        conta.saque(1000);

       conta.pedirEmprestimo(1000);


    }
}
