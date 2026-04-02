package br.inatel.poo.aula10_uml;

public class Conta {
    //Atributos
    private double saldo;
    private int numero;
    private double limite;
    private Cliente[] cliente = new Cliente[10];

    //métodos
    public void deposito(double quantia) {
        if (quantia > 0)
            this.saldo += quantia;
    }

    public void saque(double quantia) {
        if (this.saldo > quantia)
            this.saldo -= quantia;
    }

    public void transferir(Conta contaDestino, double quantia) {
        if (this.saldo >= quantia) {
            this.saldo -= quantia;
            contaDestino.saldo += quantia;
        }
    }

        public void addCliente(Cliente cliente){
            for (int i = 0; i < this.cliente.length; i++) {
                if (this.cliente[i] == null) {
                    this.cliente[i] = cliente;
                    break;
                }
            }
        }

        public void listaCliente(){
            for (Cliente cliente : this.cliente){
                if (cliente != null)
                    System.out.println(cliente.getNome());
            }
        }
    }
