package org.Ex3;
import java.util.Scanner;

public class vida_de_estudante {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int NFA;
       // int NP3=0;

        System.out.println("Digite o valor da sua NPA: ");
        int NPA = teclado.nextInt();

        if(NPA>=60){
            NFA=NPA;
            System.out.println("Aluno aprovado!");
        }else if (NPA<30){
            NFA=NPA;
            System.out.println("Aluno reprovado!");
        }else if (NPA >= 30 && NPA < 60){
            System.out.println("Digite o valor da np3: ");
            int NP3 = teclado.nextInt();

            NFA = (NPA + NP3)/2;

            if(NFA>=50){
                System.out.println("Aluno aprovado com NP3!");
            }else{
                System.out.println("Aluno reprovado com NP3!");
            }
        }

    }
}
