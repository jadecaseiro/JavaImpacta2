package cap7;

public class PrimeiroArray {
	static public void main(String[] args) {

		int[] numeros = new int[3];
		// Indice do Array começa em ZERO

		String[] palavras = new String[4];

		palavras[0] = "Não ";
		palavras[1] = "estou ";
		palavras[2] = "com ";
		palavras[3] = "sono. ";

		System.out.println(palavras[0] + palavras[1] + palavras[2]
				+ palavras[3]);

		for (int i = 0; i < palavras.length; i++) {
			System.out.print(palavras[i]);
		}

		numeros[0] = 100;
		numeros[1] = 200;
		numeros[2] = 300;

		System.out.println("\n" + numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
	}

}
