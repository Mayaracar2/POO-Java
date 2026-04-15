package br.inatel.poo.Capitulo8_Heranca_Polimorfismo.Cafeteria_Herança;

public class Main {
    public static void main(String[] args) {
        BrownieNutella bwNutella = new BrownieNutella("Nutella", 10, "Nutella");
        BrownieCafe bwCafe = new BrownieCafe("Café", 11, "Café");

        bwCafe.addMaisCafe();
        bwNutella.addMaisNutella();

        bwNutella.addCarrinhoDeCompras();
        bwCafe.addCarrinhoDeCompras();
    }
}
