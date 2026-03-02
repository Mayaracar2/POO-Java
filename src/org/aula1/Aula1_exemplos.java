package org.aula1;

public class Aula1_exemplos {
    public static void main(String[] args) {

     /* String nome = "Inatel";

        System.out.println(nome);
        System.out.println(nome.length());//para saber o a quant de caracteres do nome
        System.out.println(nome.toUpperCase());//Todas as letras maiúsculas
        System.out.println(nome.toLowerCase());Todas as letras minúsculas
        System.out.println(nome.getBytes());//retorna os bytes
        System.out.println(nome.replace("Inatel", "Instituto"));//Substitui o nome
    */

        int horas = 3;
        int primeiraHora = 10;
        int segundaHora = 4;
        int terceiraHora = 2;

        int soma = primeiraHora + segundaHora + terceiraHora;
        double media = soma/horas;

        System.out.println("Total: " + soma);
        System.out.println("Media: " + media);
    }
}
