package cap13.exemplos;

public class Executando3 {
	public static void main(String[] args) {
		ExemploFuncional3 exemploFuncional3 = d -> Math.sqrt(d);
		
		System.out.println(exemploFuncional3.execute(144));
	}

}
