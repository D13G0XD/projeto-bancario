import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = "Diego";
        String tipo = "Corrente";
        double valor = 2500;

        System.out.println("\n***************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + tipo);
        System.out.println("Saldo: " + valor + " R$");
        System.out.println("***************************************\n\n");

        System.out.println("Operações: \n");
        System.out.println("1- Consultar saldos atual.");
        System.out.println("2- Receber valor.");
        System.out.println("3- Fazer uma transferência.");
        System.out.println("4- Sair\n");

        System.out.print("Selecione uma opção: ");
        int opcao = entrada.nextInt();

        while(opcao > 0) {
            if (opcao == 1) {
                System.out.println("\nSeu valor atual é: " + valor + " R$" + "\n");

                System.out.println("Operações: \n");
                System.out.println("1- Consultar saldos atual.");
                System.out.println("2- Receber valor.");
                System.out.println("3- Fazer uma transferência.");
                System.out.println("4- Sair\n");

                System.out.print("\nSelecione uma opção: ");
                opcao = entrada.nextInt();

            } else if (opcao == 2) {
                System.out.print("\nInsira o valor recebido: ");
                double valorRecebido = entrada.nextDouble();
                valor += valorRecebido;
                System.out.println("\nO depósito foi efetuado com sucesso!\n");

                System.out.println("\nOperações: \n");
                System.out.println("1- Consultar saldos atual.");
                System.out.println("2- Receber valor.");
                System.out.println("3- Fazer uma transferência.");
                System.out.println("4- Sair\n");

                System.out.print("\nSelecione uma opção: ");
                opcao = entrada.nextInt();

            } else if (opcao == 3) {
                System.out.print("\nInsira o valor da transação: ");
                double transacao = entrada.nextDouble();
                if (transacao <= valor) {
                    valor -= transacao;
                    System.out.println("\nA transferência foi efetuada com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente! Insira um valor válido!");
                }


                System.out.println("\nOperações: \n");
                System.out.println("1- Consultar saldos atual.");
                System.out.println("2- Receber valor.");
                System.out.println("3- Fazer uma transferência.");
                System.out.println("4- Sair\n");

                System.out.print("\nSelecione uma opção: ");
                opcao = entrada.nextInt();



            } else {
                System.out.println("Até mais!");
                break;
            }

        }



    }
}