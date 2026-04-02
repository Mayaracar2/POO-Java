package br.inatel.poo.Ex0_uml;

public class Cantina {
    public String nome;
    public Salgado[] salgado = new Salgado[3];

    //this referencia a instancia/objeto criado, ele aponta para o atributo da classe que esta sendo usada por esse obj.]

    public void addSalgado(Salgado novoSalgado){
        for(int i=0; i<this.salgado.length; i++){
            if(this.salgado[i] == null){
                this.salgado[i] = novoSalgado;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println(this.nome);
        System.out.println("Salgados: ");
        for(int i=0; i<this.salgado.length; i++){
            if(this.salgado[i] != null){
                System.out.println(this.salgado[i].nome);
            }
        }
    }
}
