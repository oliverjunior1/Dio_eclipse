package tonniJavaAndAiInEurope;
// Coloque o input no formato especificado na descrição do problema
import java.util.Scanner;

public class CEventOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dois números inteiros
        System.out.println("Digite dois números inteiros (a e b):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Digite 'PAR' para contar números pares ou 'IMPAR' para contar números ímpares:");
        String parOuImpar = scanner.next();

        // Conta quantos números entre a e b (inclusive) são pares ou ímpares
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (parOuImpar.equals("PAR") && i % 2 == 0) {
                count++;
            } else if (parOuImpar.equals("IMPAR") && i % 2 != 0) {
                count++;
            }
        }
        System.out.println("Quantidade de números " + parOuImpar + " entre " + a + " e " + b + ": " + count);
    }
}
