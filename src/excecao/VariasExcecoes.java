package excecao;

public class VariasExcecoes {

	public static void main(String[] args) {
		try {
			String texto = null;
			System.out.println(texto.length());
		} catch (NullPointerException e) {
			System.out.println("Erro: Objeto nulo.");
		} catch (Exception e) {
			System.out.println("Erro genérico.");
		}

	}

}
