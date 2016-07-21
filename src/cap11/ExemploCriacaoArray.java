package cap11;

public class ExemploCriacaoArray {

	public static void main(String[] args) {

		int[] numeros = new int[4];
		String[] nomes = new String[5];
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;

		nomes[0] = "Ana";
		nomes[1] = "Bete";
		nomes[2] = "Cida";
		nomes[3] = "João";
		nomes[4] = "Pedro";

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);

		}
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}

}
