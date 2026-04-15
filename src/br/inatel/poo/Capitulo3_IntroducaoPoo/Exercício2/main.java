package br.inatel.poo.Capitulo3_IntroducaoPoo.Exercício2;

public class main {
    static public void main (String[] args){
        Zumbis tipoZumbi = new Zumbis();
        var zumbi1 = new Zumbis();

        tipoZumbi.nome = "Plankiton";
        tipoZumbi.ataque = "pedra";
        tipoZumbi.velocidade = "rápido";
        tipoZumbi.vidas = 15;

        zumbi1.nome = "Katatau";
        zumbi1.ataque = "fogo";
        zumbi1.velocidade = "devagar";
        zumbi1.vidas = 12;

        tipoZumbi.descrever();
        zumbi1.descrever();

        System.out.println("___________________________________________");

        tipoZumbi = zumbi1;

        tipoZumbi.descrever();
        zumbi1.descrever();

        /*tipoZumbi.mover();
        tipoZumbi.atacar();
        tipoZumbi.mostraVida();
        zumbi1.mostraVida();
        zumbi1.transferirVida(tipoZumbi, 3);
        tipoZumbi.mostraVida();
        zumbi1.mostraVida();*/
    }
}
