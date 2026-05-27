package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object[] objetos = new Object[100];

        Object minhaClasse = new MinhaClasse();
        MinhaClasse minhaClasse1 = new MinhaClasse();

        objetos[0] = minhaClasse;
        objetos[1] = minhaClasse1;
        objetos[2] = new String("Java");

        System.out.println("Teste");

        if (objetos[2] instanceof MinhaClasse) {
            System.out.println("Objetos de tipos iguais");
            MinhaClasse minhaClasse2 = ( MinhaClasse) objetos[2];
        }
        //else
            //System.err.println("Objetos de tipos DIFERENTES");

        //Saída padrão do programa
        System.out.println("Saída padrão do programa");

        // Saídas de erro do programa
        //System.err.println("Saídas de erro do programa");

        //System.exit(20001); //Encerra a execução

        // Entradas do sistema
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entrar com um valor");
        //String valor = teclado.nextLine();

        //System.out.println("Valor digitado: " + valor);

        String arquitetura = System.getProperty("os.arch");
        String nomeSO = System.getProperty("os.name");
        String versaoJvm = System.getProperty("java.version");

        System.out.println("Arquitetura do PC: " + arquitetura);
        System.out.println("Nome do Sistema Operacional: " + nomeSO);
        System.out.println("Versão da JVM: " + versaoJvm);

        String poo = "Java";
        String poo1 = "Java";
        String poo2 = new String("Javinha");
        String poo3 = new String("jAVA");

        if (poo == poo1) {
            System.out.println("Strings iguais");
        }
        else {
            System.out.println("Strings Diferentes");
        }

        if(poo.equals(poo3)) {
            System.out.println("String pelo equals() IGUAIS");
        }
        else {
            System.out.println("String pelo equals() DIFERENTE");
        }

        if(poo.equalsIgnoreCase(poo3)) {
            System.out.println("String pelo equalsIgnoreCase() IGUAIS");
        }
        else {
            System.out.println("String pelo equalsIgnoreCase() DIFERENTE");
        }

        List<Integer> inteiros = new ArrayList<>();


        // Embrulhando um primitivo
        int x = 10;
        Integer x1 = Integer.valueOf(x);

        System.out.println(x);
        System.out.println(x1);

        // Desembrulhando o tipo primitivo
        int y = x1.intValue();
        System.out.println(y);

        String pi = "3.1415";
        float pi1 = Float.parseFloat(pi);

        System.out.println(pi);
        System.out.println(pi1);

        x1.toString();
        System.out.println(x1);

        double flutuante = 5.5;
        double flutuanteArredondado = Math.round(flutuante);
        System.out.println(flutuanteArredondado);

        System.out.println(Math.abs(-45));

        System.out.println(Math.sqrt(25));



    }
}