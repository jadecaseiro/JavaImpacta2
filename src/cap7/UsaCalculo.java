package cap7;

public class UsaCalculo {
	public static void main(String[] args) {

		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		System.out.println("Soma: " + Calculo.somar(x, y) + "\nDivisão: "
				+ Calculo.dividir(x, y) + "\nMultiplicação: "
				+ Calculo.multiplicar(x, y) + "\nSubtração: "
				+ Calculo.subtrair(x, y));

	}
}
