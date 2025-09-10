package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Solicita os dois números dentro do try
            System.out.println("Coloque um número: ");
            int num1 = sc.nextInt();

            System.out.println("Coloque um outro número: ");
            int num2 = sc.nextInt();

            // Tenta dividir
            int resultado = num1 / num2;
            System.out.println("Resultado: " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Coloque um número, não um caractere!");
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } finally {
            System.out.println("Operação encerrada.");
            sc.close();
        }
    }
}