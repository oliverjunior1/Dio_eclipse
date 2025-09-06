package tonniJavaAndAiInEurope.CarProject;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        car meuCarro = new car();
        int opcao;

        System.out.println("🚗 Bem-vindo ao simulador de carro!");

        do {
            System.out.println("\n=== Menu do Carro ===");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Frear");
            System.out.println("5 - Reabastecer");
            System.out.println("6 - Mudar marcha");
            System.out.println("7 - Ver status do carro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    meuCarro.turnOn();
                    break;
                case 2:
                    meuCarro.turnOff();
                    break;
                case 3:
                    meuCarro.accelerate();
                    break;
                case 4:
                    meuCarro.brake();
                    break;
                case 5:
                    meuCarro.refuel();
                    break;
                case 6:
                    System.out.print("Digite a marcha (1 a 6): ");
                    int marcha = scanner.nextInt();
                    meuCarro.changeGear(marcha);
                    break;
                case 7:
                    System.out.println("\n📊 Status do carro:");
                    System.out.println("Ligado: " + (meuCarro.isOn() ? "Sim" : "Não"));
                    System.out.println("Velocidade: " + meuCarro.getSpeed() + " km/h");
                    System.out.println("Combustível: " + meuCarro.getFuel() + "%");
                    break;
                case 0:
                    System.out.println("Encerrando o simulador...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
        System.out.println("🚗 Simulação finalizada. Até a próxima!");
    }
}