package org.aula8_poo;

public class Empresa {
    public String nome;

    public Empresa(){
        Departamento departamento = new Departamento();
        departamento.nome = "Engenharia";
        System.out.println(departamento.nome);
    }
}
