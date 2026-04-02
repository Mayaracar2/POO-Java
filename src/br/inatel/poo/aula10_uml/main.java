package br.inatel.poo.aula10_uml;

public class main {
    public static void main (String [] args){
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.setNome("Sarah");
        cliente.setCpf("111111111"); // CPF é int na sua classe

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Maria");
        cliente1.setCpf("222222222");

        conta.addCliente(cliente);
        conta.addCliente(cliente1);

        conta.listaCliente();

        //Matriz
        //Trabalhando com arrays multiplos

        int[][] matriz = new int[5][5];

        //5 linhas e 5 colunas respectivamente
        //o segundo for executa todas as colunas de 1 linha
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = i + j;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    matriz[i][j]= 1;
                }
                else
                    matriz [i][j] = 0;
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
