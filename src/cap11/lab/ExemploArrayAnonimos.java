package cap11.lab;

public class ExemploArrayAnonimos {

	/*
	 * Crie o m�todo est�tico somar, que receba 3 vari�veis doubles e retorne o
	 * resultado da soma
	 * 
	 * Fa�a uma sobrecarga do m�todo somar, permitindo que ele receba um arrays
	 * de doubles
	 * 
	 * N�O altere nada no m�todo main
	 * 
	 * Quando os m�todos somar estiverem prontos, os erros de compila��o dever�o
	 * sumir
	 */
	static double somar(double a, double b, double c) {
		return a + b + c;
	}

	static double somar(double[] soma) {
		double resultado = 0;
		for (double v : soma) {
			resultado += v;

		}
		return resultado;

	}

	public static void main(String[] args) {

		double valores[] = { 2, 10, 4, 3 };

		System.out.println("Resultado: " + somar(valores)); // sobrecarregando a
															// vers�o q recebe
															// arrays
		System.out.println("Outro resultado: "
				+ somar(new double[] { 20, 10, 40, 30 })); // sobrecarregando a
															// vers�o q recebe
															// arrays
		System.out.println("Resultado da soma: " + somar(5, 7, 6)); // sobrecarregando
																	// a vers�o
																	// q recebe
																	// vari�veis
	}

}
