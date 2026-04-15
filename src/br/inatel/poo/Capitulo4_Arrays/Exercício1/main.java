package br.inatel.poo.Capitulo4_Arrays.Exercício1;

public class main {
    public static void main (String[] args){
        Banda banda = new Banda();
        banda.nome = "Black Pinkk";
        banda.genero = "Kpop";

        Musica musica1 = new Musica();
        musica1.nome = "Paranoid";

        Musica musica2 = new Musica();
        musica2.nome = "Iron main";

        Musica musica3 = new Musica();
        musica3.nome = "Ozzy";

        Membro membro1 = new Membro();
        membro1.nome = "Tony Sales";

        Membro membro2 = new Membro();
        membro2.nome = "Josefredo";

        Empresario empresario = new Empresario();
        empresario.nome = "Chistopher";

        banda.addEmpresarioNovo(empresario);
        banda.addMusicaNova(musica1);
        banda.addMusicaNova(musica2);
        banda.addMusicaNova(musica3);
        banda.addMembroNovo(membro1);
        banda.addMembroNovo(membro2);

        banda.mostraInfo();

    }
}
