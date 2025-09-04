package tonniJavaAndAiInEurope;

import java.util.Scanner;

public class ETemperatureConverter {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Verifica se a próxima entrada é um número do tipo double
        if (scanner.hasNextDouble()) {
            // Lê o valor em Celsius fornecido pelo usuário
            double celsius = scanner.nextDouble();

            // TODO: Verifique se a temperatura fornecida é maior ou igual ao zero absoluto (-273.15°C)
            if (celsius >= -273.15) {
                double fahrenheit = (celsius * 9/5) + 32;
                // TODO: Converta a temperatura de Celsius para Fahrenheit e exiba o resultado formatado com uma casa decimal
                System.out.println(fahrenheit);
            } else {
                System.out.println("Entrada invalida");
            }

        } else {
            // Caso a entrada não seja um número válido, exibe mensagem de erro
            System.out.println("Entrada invalida");
        }

        scanner.close();
    }
    
}
