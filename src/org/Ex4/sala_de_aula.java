package org.Ex4;
import java.util.Scanner;

public class sala_de_aula {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos (10,20 e 30): ");
        int qtd = teclado.nextInt();

        switch(qtd) {
            case 10:
                System.out.println("Sala I-6");
                break;
            case 20:
                System.out.println("Sala I-6");
                break;
            case 30:
                System.out.println("Sala I-5");
                break;
            default:
                System.out.println("Entre em contato com o instrutor");
        }
    }
}
