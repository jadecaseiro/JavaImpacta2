package cap4.lab;

public class Cap4Laboratorio1 {
	public static void main(String[] args) {
		int numero = 10;
		int divisoes = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0)
				divisoes++;
		}
		if (divisoes <= 2)
			System.out.println(numero + " � numero Primo");
		else
			System.out.println(numero + " n�o � numero primo");
	}
}
/**
 * Numero primo s� pode ser dividido por ele mesmo ou por 1, ou seja, apenas
 * dois divisores
 **/
