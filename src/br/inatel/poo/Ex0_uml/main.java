package br.inatel.poo.Ex0_uml;

public class main {
    public static void main (String[] args){
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado salgado = new Salgado();
        Salgado salgado1 = new Salgado();
        Salgado salgado2 = new Salgado();

        salgado.nome = "Esfirra";
        salgado1.nome = "Eroladinho";
        salgado2.nome = "Pizza";

        cantina.addSalgado(salgado);
        cantina.addSalgado(salgado1);
        cantina.addSalgado(salgado2);

        cantina.mostraInfo();
    }
}
