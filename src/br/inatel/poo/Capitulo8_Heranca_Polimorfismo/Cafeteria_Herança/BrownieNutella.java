package br.inatel.poo.Capitulo8_Heranca_Polimorfismo.Cafeteria_Herança;

public class BrownieNutella extends  Brownie{
    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    public void addMaisNutella(){
        System.out.println("Adicionando mais nutella");
    }
}
