package org.Ex1_poo;

public class Zumbis {
    //atributos
    public String nome;
    public String velocidade;
    public String ataque;
    public int vidas;

    //métodos
    public void mover(){
        System.out.println("O zumbi " + nome + " está se movendo " + velocidade);
    }

    public void atacar(){
        System.out.println("O zumbi " + nome + " está atacando com " + ataque);
    }

    public void morder(){
        vidas++;
        System.out.println("O zumbi " + nome + " está com " + vidas + " vida");
    }
}
