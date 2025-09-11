package javaInnerOut;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverEmUmArquivo {

	public static void main(String[] args) {
		  try (BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"))) {
	            writer.write("Olá, Joaquim!");
	            writer.newLine();
	            writer.write("Este é um exemplo de escrita com java.io.");
	        } catch (IOException e) {
	            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
	        }

		

	}

}
