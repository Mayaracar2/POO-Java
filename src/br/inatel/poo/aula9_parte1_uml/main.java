package br.inatel.poo.aula9_parte1_uml;

public class main {
    public static void main (String[] args){
        Personagem personagem = new Personagem();

        personagem.nome = "Rambo";
        personagem.ponto = 10;

        Arma arma = new Arma();

        arma.nome = "Rifle";
        arma.resistencia = 100;

        personagem.arma = arma;

        System.out.println("Personagem: " + personagem.nome);
        System.out.println("Pontos: " + personagem.ponto);
        System.out.println("Resistência: " + personagem.arma.resistencia);

        System.out.println("__________________________________");
        personagem.tomarDano();
        personagem.tomarDano();

        personagem.userArma();

        System.out.println("Personagem: " + personagem.nome);
        System.out.println("Pontos: " + personagem.ponto);
        System.out.println("Resistência: " + personagem.arma.resistencia);
        personagem.tomarDano();

    }
}
