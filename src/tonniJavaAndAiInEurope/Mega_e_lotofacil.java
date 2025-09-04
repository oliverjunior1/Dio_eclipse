package tonniJavaAndAiInEurope;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Mega_e_lotofacil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escolha o jogo: 1 para Mega-Sena, 2 para Lotofácil");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Você escolheu Mega-Sena.");
            sortearNumeros(escolha);
        } else if (escolha == 2) {
            System.out.println("Você escolheu Lotofácil.");
            sortearNumeros(escolha);
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    public static void sortearNumeros(int escolha) {
        if (escolha == 1) {
            System.out.println("Números sorteados da Mega-Sena:");
            int[] numeros = gerarNumerosUnicos(6, 60);
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
        } else if (escolha == 2) {
            System.out.println("Números sorteados da Lotofácil:");
            int[] numeros = gerarNumerosUnicos(15, 25);
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
        }
    }

    // Gera números únicos dentro de um intervalo
    public static int[] gerarNumerosUnicos(int quantidade, int limite) {
        Set<Integer> numerosSet = new HashSet<>();
        while (numerosSet.size() < quantidade) {
            int num = (int) (Math.random() * limite) + 1;
            numerosSet.add(num);
        }
        int[] resultado = numerosSet.stream().mapToInt(Integer::intValue).toArray();
        return resultado;
    }
}