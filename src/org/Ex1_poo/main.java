package org.Ex1_poo;

public class main {
    static public void main (String[] args){
        Zumbis tipoZumbi = new Zumbis();

        tipoZumbi.nome = "Plankiton";
        tipoZumbi.ataque = "pedra";
        tipoZumbi.velocidade = "rápido";
        tipoZumbi.vidas = 2;

        tipoZumbi.mover();
        tipoZumbi.atacar();
        tipoZumbi.morder();
    }
}
