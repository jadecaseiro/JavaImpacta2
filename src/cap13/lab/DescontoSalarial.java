package cap13.lab;

public class DescontoSalarial {
	public static void main(String[] args) {
		double[] salariosBrutos = { 1350, 4320.15, 8235.25, 2500.55, 1830.00, 850.26, 3614.29, 12500.00 };
		double[] salariosLiquidos;

		salariosLiquidos = DoubleArrayUtils.transformaValores(salariosBrutos, valor -> valor - 0.1 * valor);
		for (double salario : salariosLiquidos){
			System.out.println(salario);
		}
		DoubleArrayUtils.processaValores(salariosBrutos, salario -> System.out.println(salario));
	}

}
