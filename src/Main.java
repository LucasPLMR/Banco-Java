import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaração de Variável

        String nome = "Mike Ross";
        String tipoConta = "Conta Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("***************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n***************************");

        String menu = """
                ** Digite sua opção **
                
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
    
                """;

        Scanner leitura = new Scanner(System.in);

        //Começo do Loop
        while(opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldo);

            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Você não possui saldo suficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo Saldo: " + saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Digite o valor que esta recebendo: ");
                double valorReceb = leitura.nextDouble();
                saldo += valorReceb;
                System.out.println("Novo Saldo: " + saldo);

            } else if (opcao == 4) {
                System.out.println("Opção invalida");
            }
        }
            }
        }