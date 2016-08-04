package cap14;

public class TestaGenerics {
	// método generics printArray
	public static <G> void exibirArray(G[] numeros) {
		// mostra os elementos do array
		for (G contador : numeros)
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
