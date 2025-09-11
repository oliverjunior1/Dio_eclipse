package javaInnerOut;

import java.io.File;

public class VerificarSeUmArquivoExiste {

	public static void main(String[] args) {
		File arquivo = new File("saida.txt");
		if (arquivo.exists()) {
			System.out.println("Arquivo Encontrado");
		} else {
			System.out.println("Arquivo não existe.");
		}

	}

}
