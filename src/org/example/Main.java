package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double pi = 3.1415;
        int piInteiro = (int) pi; //converter o pi para inteiro
        System.out.println(pi);
        System.out.println(piInteiro);
        System.out.println("------------");

        double numero = 2;
        int numero1 = (int) numero;
        System.out.println("Valor de numero: " + numero);
        System.out.println("Valor do numero convertido para inteiro: " + numero1);

        int idade = 20;
        long idade1 = idade; //conversão por promoção
        int  idade2 = (int) idade1; //conversão por casting, fazemos isso pois o tipo do long é maior que o tipo int, ent precisamos fazer um cast para converter o valor de volta para isso
        System.out.println("Valor da idade: " + idade);
        System.out.println("Valor da idade convertida para long: " + idade1);
        System.out.println("Valor da idade convertida para int: " + idade2);

        pi = 3.1415f;
        double pi2 = pi; //conversão por promoção
        float pi3 = (float) pi2; //conversão por casting

        int ano = Integer.parseInt("2026");//conversão por casting

        //char -> string
        char letra = 'F';
        String letra1 = String.valueOf(letra); //converte o valor de letra para string
        String letra2 = Character.toString(letra);//outra forma de converter o valor de letra para string
        String letra3 = "" + letra;// outra forma de converter

        String faculdade = "Inatel";
        char primeiraletra = faculdade.charAt(0);//pega a primeira letra da string
        char ultimaletra = faculdade.charAt(faculdade.length() - 1);//pega a ultima letra da string

        System.out.println("Olá mundo");
        System.out.println("Olá mundo 2");
        System.out.printf("Hello word %d\n", 2);
        System.out.printf("Inatel %.2f\n", 3.1415);
        System.out.printf("Faculdade %s\n", "Inatel");
        //o %n é usado para pular uma linha, assim como o \n, mas é mais recomendado usar o %n, mais portátil e funciona em qualquer sistema operacional

        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com sua idade: ");
        idade = teclado.nextInt();

        System.out.println("Entre com sua altura: ");
        double altura = teclado.nextDouble();

        teclado.nextLine();//limpa o buffer para usar string depois de valor e captura o \n

        System.out.println("Entre com o seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("%d, %.2f. %s \n, idade, altura, nome");
    }
}