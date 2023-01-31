
public class TestaCondicionais {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 10;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você já é maior de idade, seja bem vindo!!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("você não tem 18 anos, mas pode entrar," + "pois esta acompanhado ");
			} else {
				System.out.println("Você tem menos de 18 anos");
			}

		}
	}
}
