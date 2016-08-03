package cap13;

public class ConjuntoLambdas {
	public static void main(String[] args) {

		OperacaoAritmetica[] calculos = { (x, y) -> x + y, (x, y) -> x - y, (x, y) -> x / y, (x, y) -> x * y };

		for (OperacaoAritmetica operacaoAritmetica : calculos)	 {

			System.out.println(operacaoAritmetica.execute(50, 2));

		}

	}
}