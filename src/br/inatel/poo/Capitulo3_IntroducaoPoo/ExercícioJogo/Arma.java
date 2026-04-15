package br.inatel.poo.Capitulo3_IntroducaoPoo.ExercícioJogo;

public class Arma {
    public String nome;
    public int poder;
    public int resistencia;
    public String descricao;

    public void mostraInfoArma(){
        System.out.println(this.resistencia);
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.poder);
    }
}
