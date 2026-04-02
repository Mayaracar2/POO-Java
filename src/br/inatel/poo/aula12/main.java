package br.inatel.poo.aula12;
import br.inatel.poo.aula12.matematica2.matematica2;
import br.inatel.poo.aula12.matematica.matematica;


public class main {
    public static void main(String[] args){
        matematica2 mat2 = new matematica2();
        matematica mat1 = new matematica();

        // br.inatel.poo.aula12.matematica.matematica mat1 = new br.inatel.poo.aula12.matematica.matematica();
        // br.inatel.poo.aula12.matematica.matematica mat = new br.inatel.poo.aula12.matematica.matematica();

        System.out.println(mat1.soma(1,2));
        System.out.println(mat1.divisao(2,0));
        System.out.println(mat1.divisao(10,2));

        mat2.soma(1,2);
        mat2.divisao(2,1);
        mat2.divisao(10,2);
    }
}
2.137 1.493,5