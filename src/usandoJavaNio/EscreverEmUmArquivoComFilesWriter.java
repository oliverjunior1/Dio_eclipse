package usandoJavaNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class EscreverEmUmArquivoComFilesWriter {

	public static void main(String[] args) {
		try {
			Path caminho = Path.of("dados.txt");
			Files.write(caminho, Arrays.asList("Olá, Joaquim!", "Bem-vindo ao java.nio"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
			System.out.println("Arquivo gravado com sucesso.");
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}

}
