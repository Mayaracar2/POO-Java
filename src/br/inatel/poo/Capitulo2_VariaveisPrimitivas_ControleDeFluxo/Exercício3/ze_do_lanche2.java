package br.inatel.poo.Capitulo2_VariaveisPrimitivas_ControleDeFluxo.Exercício3;
import java.util.Scanner;

public class ze_do_lanche2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos lanches foram consumidos na primeira hora? ");
        int lanchesPrimeiraHora = teclado.nextInt();

        System.out.println("Quantos lanches foram consumidos na segunda hora? ");
        int lanchesSegundaHora = teclado.nextInt();

        System.out.println("Quantos lanches foram consumidos na terceira hora? ");
        int lanchesTerceiraHora = teclado.nextInt();

        int soma = lanchesPrimeiraHora + lanchesSegundaHora + lanchesTerceiraHora;
        double media = soma / 3.0;

        System.out.println("Total de lanches consumidos: " + soma);
        System.out.println("Média de lanches por hora: " + media);
    }
}
