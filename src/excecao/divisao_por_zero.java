package excecao;

public class divisao_por_zero {

	public static void main(String[] args) {
		try {
			int resultado = 10/0;
			System.out.println("Resultado: " + resultado);
			
		} catch (ArithmeticException e) {
			System.out.println("Erro divisão por zero não é permitido.");
		}

	}
}
