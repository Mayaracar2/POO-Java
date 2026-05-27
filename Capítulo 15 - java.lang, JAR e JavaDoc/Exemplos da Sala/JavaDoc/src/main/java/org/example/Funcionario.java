package org.example;

/**
 * Esta classe controla os funcionários de uma empresa
 * @author Flávio H M Bergamini
 * @since Release 1
 * @version 1.0
 */
public class Funcionario {
    private String matricula;
    private double salario;

    /**
     * Este método busca a matrícula de um funcionário
     * @return String - numérica da matrícula do funcionário
     */
    public String getMatricula() {
        return this.matricula;
    }

    /**
     * Este método é utilizado quando o funcionário ganha ym aumento salarial
     * @param valor Double - o quanto de aumento o funcionario ganhou
     * @return Double - valor do salario atualizado
     */
    public double atualizaSalario(double valor) {
        this.salario += valor;
        return this.salario;
    }
}
