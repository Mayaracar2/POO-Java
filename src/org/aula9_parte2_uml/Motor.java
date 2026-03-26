package org.aula9_parte2_uml;

public class Motor {
    public String cilindradas;
    public float velocidadeMaxima;

    public void mostraInfo(){
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("velocidade Máxima:" + velocidadeMaxima);
    }
}
