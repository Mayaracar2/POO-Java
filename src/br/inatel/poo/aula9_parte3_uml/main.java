package br.inatel.poo.aula9_parte3_uml;

public class main {
    public static void main (String[] args){
        //Aula do dia 23/03 - ARRAYS

        int x[];
        int y[];
        int [] z = new int[10];
        int []a = {2, 10, 55, 30};

        double [] versoesWindows = {1,0,2,0,3,1,95.200};

        int [] vetor = new int[5];

        System.out.println(vetor.toString().getBytes());

        Conta [] contas = new Conta[5];

        Conta conta1 = new Conta();
        contas[0] = conta1;

        contas[1] = new Conta();

        contas[0].saldo = 90;
        contas[1].saldo = 150;

        //System.out.println(contas[0].saldo);
        //System.out.println(conta1.saldo);
        //System.out.println(contas[1].saldo);

        for(int i = 0; i< contas.length; i++){
            if(contas[i] != null)
                System.out.println(contas[i].saldo);
        }

        System.out.printf("_________________________________");

        for(Conta c: contas){
            if(c != null)
                System.out.println(c.saldo);
        }

        //versões do windows

        for(int i = 0; i < versoesWindows.length; i++)
            System.out.println(versoesWindows[i]);

        System.out.println("____________________________________");

        for(double versao: versoesWindows)
            System.out.println(versao);
    }
}
