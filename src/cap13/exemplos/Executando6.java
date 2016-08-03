package cap13.exemplos;

public class Executando6 {
	public static void main(String[] args) {
		ExemploFuncional4 exemploFuncional4 = valor -> {
			double quadruplo = valor*4;
			return quadruplo;
		};
		System.out.println(exemploFuncional4.quadruplo(7));
	}

}
