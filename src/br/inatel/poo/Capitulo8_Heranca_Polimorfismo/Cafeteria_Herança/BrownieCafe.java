package br.inatel.poo.Capitulo8_Heranca_Polimorfismo.Cafeteria_Herança;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void addMaisCafe(){
        System.out.println("Adicionando mais café");
    }
}
