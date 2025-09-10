package excecao;

public class AcessoAIndiceInvalido {

	public static void main(String[] args) {
		int [] numeros = {1,2,3};
		try {
			System.out.println(numeros[5]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: índice fora do limite do array.");
		}

	}

}
