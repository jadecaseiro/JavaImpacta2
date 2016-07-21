package cap11;

public class ExemploSimplesCriacaoArrayBidimensional {
	public static void main(String[] args) {
		int[][] notas = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		for (int[] n : notas) {
			for (int x : n) {
				System.out.println("Nota: " + x);
			}
		}
	}
}
