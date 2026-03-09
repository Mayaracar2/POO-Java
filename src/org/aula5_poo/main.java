package org.aula5_poo;

public class main {
    public static void main(String[] args) {
        Pessoa Renzo = new Pessoa(); //new é para criar um novo objeto

        Renzo.nome = "Renzo Mesquita";
        Renzo.idade = 35;

        //Renzo.falar();

        Professor Poo = new Professor();

        Poo.nome = "Justino";
        Poo.idade = 70;
        Poo.disciplina = "Radio";

        //Poo.falar();
        //Poo.ministraAula();

        Engenheiro Eng = new Engenheiro();

        Eng.categoria = "civil";
        Eng.idade = 29;
        Eng.nome = "Maria";
        Eng.disciplina = "Resistência dos materiais";

        Eng.falar();
        Eng.ministraAula();
        Eng.constroi();
    }
}
