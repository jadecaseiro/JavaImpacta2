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
			System.out.println(numero + " é numero Primo");
		else
			System.out.println(numero + " não é numero primo");
	}
}
/**
 * Numero primo só pode ser dividido por ele mesmo ou por 1, ou seja, apenas
 * dois divisores
 **/
