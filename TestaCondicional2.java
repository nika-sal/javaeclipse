
public class TestaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadeDePessoas = 3;
		boolean acompanhado = quantidadeDePessoas >= 2; 
		
		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			// && signfica e e || significa ou
			System.out.println("Seja bem vindo");

		} else {
			System.out.println("Infelizmente voce não pode entrar");

		}

	}
}
