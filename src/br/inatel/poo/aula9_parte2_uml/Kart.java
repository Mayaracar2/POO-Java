package br.inatel.poo.aula9_parte2_uml;

public class Kart {
    public String nome;
    public Piloto piloto;


    public Kart(){
        Motor motor = new Motor();
        motor.cilindradas = "50";
        motor.velocidadeMaxima = 100;

        motor.mostraInfo();
    }

    public void Pular(){
        System.out.println("Kart pulou");
    }

    public void soltarTurbo(){
        System.out.println("Soltou turbo");
    }

    public void fazerDrift(){
        System.out.println("Fez drift");
    }
}
