package org.Ex6;

import java.util.Random;
import java.util.Scanner;

public class Adivinhação_aprimorado {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner teclado = new Scanner(System.in);

        //Gera um numero entre 1 e 10 e salva em x;
        int x = rand.nextInt(10) + 1;

        // System.out.println("Qual número foi gerado de 1 á 10?");
        // int valor = teclado.nextInt();
        int valor;

        do {
            System.out.println("Qual número foi gerado de 1 á 10?");
            valor = teclado.nextInt();

            if (x > valor) {
                System.out.println("O valor é maior");
            } else
                System.out.println("O valor é menor ");

        } while (x != valor);

        System.out.println("Valor correto!");
    }
}