package br.inatel.poo.Capitulo2_VariaveisPrimitivas_ControleDeFluxo.aula4;

import java.util.Scanner;

public class Aula4_exemplos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int qtd = teclado.nextInt();

       /* while(qtd > 0){
            System.out.println(qtd);
            qtd = qtd--;
        }*/

        /*do {
            System.out.println(qtd);
            qtd = qtd - 1;
        } while (qtd > 0);

        for (int i=0; i<10; i++){
            System.out.println(i);
        }*/

        /*for(int i=qtd; i>0; i--){
            System.out.println(i);
        }*/

        /*int[] vetor = {1,3,6,2};

        for(int numero: vetor){
            System.out.println(numero);
        }

        System.out.println("-------------");

        for(int i=0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }*/

       /* while (qtd >0){
            System.out.println(qtd);
            qtd--;

            if(qtd==5)
                break; //para quebrar o loop
        }*/


    }
}
