package usandoJavaNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExercicioNio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Solicite ao usuário seu nome e profissão
        System.out.print("Coloque o seu nome: ");
        String name = sc.nextLine();

        System.out.print("Coloque a sua profissão: ");
        String profissao = sc.nextLine();

        // 2. Grave essas informações em perfil.txt
        Path caminho = Path.of("perfil.txt");
        List<String> conteudo = Arrays.asList(
            "Nome: " + name,
            "Profissão: " + profissao
        );

        try {
            Files.write(caminho, conteudo, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Arquivo gravado com sucesso.");
        } catch (Exception e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }

        // 3. Leia o conteúdo do arquivo e exiba no console
        try {
            List<String> linhas = Files.readAllLines(caminho);
            System.out.println("\nConteúdo do arquivo:");
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        sc.close();
    }
}