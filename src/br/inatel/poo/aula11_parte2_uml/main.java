package br.inatel.poo.aula11_parte2_uml;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner rand = new Scanner(System.in);
        Random teclado = new Random();

        int [][] campo = new int[2][2];
        int jogadas = 0;

        int linhaBomba = rand.nextInt(2);
        int colunaBomba = rand.nextInt(2);

        campo[linhaBomba][colunaBomba] = -1;

        System.out.println("Campo Minado");

        while(jogadas < 3){
            System.out.println("Entre com a posição da linha: ");
            int linha = teclado.nextInt();

            System.out.println("Entre com a posição da coluna: ");
            int coluna = teclado.nextInt();

            if (campo[linha][coluna] == -1){
                System.out.println("BOOOOOMMM!");
                System.out.println("Mina encontrada");
            }else{
                System.out.println("Caminho seguro");
                jogadas++;
            }
        }
      for(int i=0; i<campo.length; i++){
          for(int j=0; j<campo[i].length; j++){
              System.out.println(campo[i][j] + " " );
          }
          System.out.println();
      }
    }
}
