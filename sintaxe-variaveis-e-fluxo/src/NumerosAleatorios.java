
import java.lang.Math;

class NumerosAleatorios {

	public static void main(String args[]) {

		// cria um loop para imprimir 7 valores aleatórios entre 1 e 60
		// testar com arrays de numeros inteiros pré-definidos
				
			for (int i = 0; i < 6; i++) {
				
				int numRandom = (int) (Math.random() * 60) + 1;

				System.out.print(numRandom + "\t");

			}

		}
	}

