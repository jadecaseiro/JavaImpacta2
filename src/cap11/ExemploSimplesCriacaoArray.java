package cap11;

public class ExemploSimplesCriacaoArray {
	public static void main(String[] args) {
		int[] numeros = new int[3]; // Maneira Classica recriar arrays
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		
		for(int n:numeros){
			System.out.println(n);
		}
		
		int[] valores = { 100, 200, 300 };
		for(int v:valores){
			System.out.println(v);
		}
	}

}
