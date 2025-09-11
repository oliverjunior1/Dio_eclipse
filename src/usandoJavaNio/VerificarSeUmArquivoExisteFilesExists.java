package usandoJavaNio;

import java.nio.file.Files;
import java.nio.file.Path;


public class VerificarSeUmArquivoExisteFilesExists {

	public static void main(String[] args) {
		Path caminho = Path.of("dados.txt");
		if (Files.exists(caminho)) {
			System.out.println(caminho);
		} else {
			System.out.println("Arquivo não existe.");
		}

	}

}
