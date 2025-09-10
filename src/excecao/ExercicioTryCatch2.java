package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioTryCatch2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a sua idade: ");

        try {
            int idade = sc.nextInt();

            if (idade < 0) {
                throw new IllegalArgumentException("Idade negativa, você ainda não nasceu?");
            }

            System.out.printf("Sua idade é %d anos.%n", idade);

        } catch (InputMismatchException e) {
            System.out.println("Não digite letras, digite um número!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Processo finalizado.");
            sc.close();
        }
    }
}