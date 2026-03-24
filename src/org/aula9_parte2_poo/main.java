package org.aula9_parte2_poo;

public class main {
    public static void main (String[] args) {
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.piloto = p1;
        k2.piloto = p2;

    }
}
