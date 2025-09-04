package tonniJavaAndAiInEurope;

import java.util.Scanner;

public class DMathematicsWays {
    // O usuário vai informar um número inteiro n
    // O usuario vai informar outros numeros até que a divisao dele pelo primeiro numero seja 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro n:");
        int n = scanner.nextInt();
        int count = 0;
        while (true) {
            System.out.println("Digite outro número inteiro (ou um número que quando dividido por " + n + " resulte em 0 para parar):");
            int m = scanner.nextInt();
            if (m % n == 0) {
                break;
            }
            count++;
        }
        System.out.println("Quantidade de números digitados: " + count);
    }
}
