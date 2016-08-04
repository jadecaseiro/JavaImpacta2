package cap14;

public class Sobrecarregado {
	// metodo exibir array para exibir um array de character
	public static void exibirArray(Character[] numeros) {
		for (Character contador : numeros)
			System.out.print(contador + " ");
		System.out.println();
	}

	// método exibirArray para exibir um array de integer
	public static void exibirArray(Integer[] numeros) {
		// mostra os elementos do array
		for (Integer contador : numeros)
			System.out.print(contador + " ");
		System.out.println();

	}

	public static void main(String[] args) {
		Character[] arrayLetras = { 'I', 'M', 'P', 'A', 'C', 'T', 'A' };
		Integer[] arrayNumeros = { 8, 16, 32, 64, 128, 256 };
		
		System.out.println("Conteudo do Array chamado arrayLetras");
		exibirArray(arrayLetras);
		
		System.out.println("Conteudo do Array chamado arrayNumeros");
		exibirArray(arrayNumeros);
	}

}
