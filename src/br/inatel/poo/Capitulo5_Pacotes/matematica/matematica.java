package br.inatel.poo.Capitulo5_Pacotes.matematica;

public class matematica {
    public int soma(int a, int b){
        return a+b;
    }

    public int divisao(int a, int b){
        if(b != 0){
            return a/b;
        }

        return -1;
    }
}
