package cap13.exemplos;

public class Executando1 {

	public static void main(String[] args) {
		ExemploFuncional1 exemploFuncional = (n, i, s) -> System.out
				.println("Parabéns " + n.toUpperCase() + " pelos seus " + i
						+ " anos de idade," + " seu novo salário é " + s);

		exemploFuncional.exibeDados("Jade", 26, 10000);
	}

}
