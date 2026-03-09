package org.aula5_poo;

public class Professor extends Pessoa {
    String disciplina;

    void ministraAula(){
        System.out.println("Aula de " + disciplina);
    }
}
