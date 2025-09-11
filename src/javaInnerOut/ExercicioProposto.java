package javaInnerOut;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioProposto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita os dados
        System.out.println("Insira seu nome: ");
        String name = sc.nextLine();

        System.out.println("Insira a sua idade: ");
        int idade = sc.nextInt();

        // Grava no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("cadastro.txt"))) {
            writer.write("Nome: " + name);
            writer.newLine();
            writer.write("Idade: " + idade);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        // Lê e exibe o conteúdo do arquivo
        System.out.println("\nConteúdo do arquivo:");
        try (BufferedReader reader = new BufferedReader(new FileReader("cadastro.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}