package cap13.exemplos;

public class Executando1 {

	public static void main(String[] args) {
		ExemploFuncional1 exemploFuncional = (n, i, s) -> System.out
				.println("Parab�ns " + n.toUpperCase() + " pelos seus " + i
						+ " anos de idade," + " seu novo sal�rio � " + s);

		exemploFuncional.exibeDados("Jade", 26, 10000);
	}

}
