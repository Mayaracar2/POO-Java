package br.inatel.poo.Capitulo2_VariaveisPrimitivas_ControleDeFluxo.Exercício2;

public class cinema {
    public static void main(String[] args) {

        double ingresso_inteiro = 30.00;
        double meia_entrada = 15.00;

        int quant_int = 8;
        int quant_meia = 5;

        double Total_int= quant_int * ingresso_inteiro;
        double Total_meia= quant_meia * meia_entrada;
        double Total_arrecadado= Total_int + Total_meia;
        double Media= ((Total_meia) + (Total_int))/13;

        System.out.println("Valor arrecadado por ingressos inteiros: R$" + Total_int );
        System.out.println("Valor arrecadado por meia-entrada: R$" + Total_meia );
        System.out.println("Valor total arrecadado: R$" + Total_arrecadado);
        System.out.println("Media paga por ingresso: R$" + Media);

    }
}
