package cap7;

public class UsaCalculo {
	public static void main(String[] args) {

		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		System.out.println("Soma: " + Calculo.somar(x, y) + "\nDivis�o: "
				+ Calculo.dividir(x, y) + "\nMultiplica��o: "
				+ Calculo.multiplicar(x, y) + "\nSubtra��o: "
				+ Calculo.subtrair(x, y));

	}
}
