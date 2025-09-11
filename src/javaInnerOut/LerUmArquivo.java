package javaInnerOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerUmArquivo {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("saida.txt"))) {
			String linha;
			while((linha = reader.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			System.out.println("Erro ao lser o arquivo: " + e.getMessage());
		}
	}

}
