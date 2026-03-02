package org.aula3;
import java.util.Scanner;

public class Aula3_exemplos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com um número: ");
        int qtd = teclado.nextInt();

        if (qtd >= 5)
            System.out.println("Quantidade é maior que 5");
        else if (qtd >= 3 && qtd < 5) {
            System.out.println("Quantidade é maior que 3");
        } else {
            System.out.println("Quantidade menor ou igual a 3");
        }

        teclado.close();

        switch (qtd){
            case 5:
                System.out.println("Quantidade = 5");
                System.out.println("Inatel");
            case 1:
                System.out.println("Quantidade = 1 ");
                break;
            default:
                System.out.println("Quantidade é maior que 3");
        }
    }
}
