package cap12;

public class PrimeiraExcecao {
	public static void main(String[] args) {
		int x = 10;
		int y = 0;

		try {
			System.out.println(x / y);
		} catch (java.lang.ArithmeticException e) {
			e.printStackTrace();
			System.out.println("N�o � poss�vel divis�o por zero.");
		}
		System.out.println("Continua��o...");
		
	}

}
