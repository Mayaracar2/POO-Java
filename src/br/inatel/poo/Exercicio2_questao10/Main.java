package br.inatel.poo.Exercicio2_questao10;

import br.inatel.poo.Exercicio2_questao10.Turmas.Aluno;
import br.inatel.poo.Exercicio2_questao10.Turmas.Turma;

public class Main {
    public static void main(String[] args) {

        // Instancia a turma
        Turma turma = new Turma();

        // Cria 3 alunos com nomes, matrículas e notas diferentes
        Aluno aluno1 = new Aluno("Ana Silva",    "2024001", new double[]{8.5, 7.0, 9.0});
        Aluno aluno2 = new Aluno("Bruno Costa",  "2024002", new double[]{6.0, 5.5, 7.0});
        Aluno aluno3 = new Aluno("Carla Mendes", "2024003", new double[]{9.5, 10.0, 9.0});

        // Adiciona os alunos à turma
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);

        // Lista todos os alunos
        turma.listarAlunos();

        // Exibe o melhor aluno
        Aluno melhor = turma.buscarMelhorAluno();
        System.out.println("===== Melhor Aluno =====");
        System.out.println("Nome: " + melhor.getNome());
        System.out.printf("Média: %.2f%n", melhor.calculaMedia());
    }
}
