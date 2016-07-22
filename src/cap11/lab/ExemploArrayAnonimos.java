package cap11.lab;

public class ExemploArrayAnonimos {

	/*
	 * Crie o método estático somar, que receba 3 variáveis doubles e retorne o
	 * resultado da soma
	 * 
	 * Faça uma sobrecarga do método somar, permitindo que ele receba um arrays
	 * de doubles
	 * 
	 * NÃO altere nada no método main
	 * 
	 * Quando os métodos somar estiverem prontos, os erros de compilação deverão
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
															// versão q recebe
															// arrays
		System.out.println("Outro resultado: "
				+ somar(new double[] { 20, 10, 40, 30 })); // sobrecarregando a
															// versão q recebe
															// arrays
		System.out.println("Resultado da soma: " + somar(5, 7, 6)); // sobrecarregando
																	// a versão
																	// q recebe
																	// variáveis
	}

}
