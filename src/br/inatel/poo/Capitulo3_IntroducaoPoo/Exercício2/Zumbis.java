package br.inatel.poo.Capitulo3_IntroducaoPoo.Exercício2;

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

    public void mostraVida(){
        System.out.println("Vida do Zumbi: " + vidas );
    }

    public void transferirVida(br.inatel.poo.Capitulo3_IntroducaoPoo.ExercícioZumbi.Zumbis zumbiAlvo, double quantia){
        this.vidas -= quantia;
        zumbiAlvo.vidas += quantia;
    }

    public void descrever(){
        mover();
        atacar();
        mostraVida();
    }
}
