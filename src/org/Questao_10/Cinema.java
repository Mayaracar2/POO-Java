package org.Questao_10;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de ingressos inteiros:");
        int quant_int = teclado.nextInt();

        System.out.println("Valor do ingresso inteiro");
        teclado.nextLine();
        String ingresso_inteiro = teclado.nextLine();
        ingresso_inteiro = ingresso_inteiro.replace(",", ".");
        double valorInt = Double.parseDouble(ingresso_inteiro);

        System.out.println("Digite a quantidade de meia-entrada: ");
        int quant_meia = teclado.nextInt();

        System.out.println("Valor da meia-entrada:");
        teclado.nextLine();
        String meia_entrada = teclado.nextLine();
        meia_entrada = meia_entrada.replace(",", ".");
        double valorMeia = Double.parseDouble(meia_entrada);

        double Total_int= quant_int * valorInt;
        double Total_meia= quant_meia * valorMeia;
        double Total_arrecadado= Total_int + Total_meia;
        double Media= ((Total_meia) + (Total_int))/(quant_int+quant_meia);

        System.out.println("Valor arrecadado por ingressos inteiros: R$" + Total_int );
        System.out.println("Valor arrecadado por meia-entrada: R$" + Total_meia );
        System.out.println("Valor total arrecadado: R$" + Total_arrecadado);
        System.out.println("Media paga por ingresso: R$" + Media);

    }
}
