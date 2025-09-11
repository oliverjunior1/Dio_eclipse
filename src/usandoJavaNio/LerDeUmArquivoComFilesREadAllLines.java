package usandoJavaNio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LerDeUmArquivoComFilesREadAllLines {

	public static void main(String[] args) {
		try {
			Path caminho = Path.of("dados.txt");
			List<String> linhas = Files.readAllLines(caminho);
			for (String linha: linhas) {
				System.out.println(linha);
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}

	}

}
