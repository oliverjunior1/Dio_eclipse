package tonniJavaAndAiInEurope.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar conta
        System.out.println("Digite o nome do titular:");
        String nomeTitular = scanner.nextLine();
        Conta conta = new Conta(nomeTitular, 0.0);

        int opcao;
        do {
            System.out.println("\n=== Menu da Conta Bancária ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Pagar boleto");
            System.out.println("4 - Ver saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar: R$");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite o valor para sacar: R$");
                    double valorSaque = scanner.nextDouble();
                    if (!conta.sacar(valorSaque)) {
                        System.out.println("Saldo insuficiente. Deseja usar o cheque especial? (s/n)");
                        String resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("s")) {
                            if (conta.usarChequeEspecial(valorSaque)) {
                                System.out.println("Saque realizado com cheque especial.");
                            } else {
                                System.out.println("Não foi possível realizar o saque.");
                            }
                        } else {
                            System.out.println("Saque cancelado.");
                        }
                    } else {
                        System.out.println("Saque realizado com sucesso.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do boleto: R$");
                    double valorBoleto = scanner.nextDouble();
                    if (!conta.sacar(valorBoleto)) {
                        System.out.println("Saldo insuficiente. Deseja usar o cheque especial? (s/n)");
                        String resposta = scanner.next();
                        if (resposta.equalsIgnoreCase("s")) {
                            if (conta.usarChequeEspecial(valorBoleto)) {
                                System.out.println("Pagamento realizado com cheque especial.");
                            } else {
                                System.out.println("Não foi possível pagar o boleto.");
                            }
                        } else {
                            System.out.println("Pagamento cancelado.");
                        }
                    } else {
                        System.out.println("Pagamento do boleto realizado com sucesso.");
                    }
                    break;

                case 4:
                    System.out.println("\nTitular: " + conta.getTitular());
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    if (conta.getSaldo() < 0) {
                        System.out.println("⚠️ Você está usando o cheque especial.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando sessão da conta...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
        System.out.println("Sessão encerrada. Obrigado por utilizar nosso sistema!");
    }
}