package br.inatel.poo.Capitulo3_IntroducaoPoo.aula5_poo;

public class Professor extends Pessoa {
    String disciplina;

    void ministraAula(){
        System.out.println("Ensina " + disciplina);
    }

   /* @Override
    public void falar(){
        System.out.println("Mudei de disciplina");
    }*/
}
