package br.inatel.poo.aula12.matematica;

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
