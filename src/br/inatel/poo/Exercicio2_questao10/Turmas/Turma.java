package br.inatel.poo.Exercicio2_questao10.Turmas;

public class Turma {

    private int quantidadeAlunos;
    private Aluno[] alunos;

    public Turma() {
        this.alunos = new Aluno[100]; // capacidade máxima
        this.quantidadeAlunos = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if (quantidadeAlunos < alunos.length) {
            alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("Turma cheia!");
        }
    }

    public void listarAlunos() {
        System.out.println("===== Lista de Alunos =====");
        for (int i = 0; i < quantidadeAlunos; i++) {
            alunos[i].mostraInfo();
        }
    }

    public Aluno buscarMelhorAluno() {
        if (quantidadeAlunos == 0) return null;

        Aluno melhor = alunos[0];
        for (int i = 1; i < quantidadeAlunos; i++) {
            if (alunos[i].calculaMedia() > melhor.calculaMedia()) {
                melhor = alunos[i];
            }
        }
        return melhor;
    }
}

