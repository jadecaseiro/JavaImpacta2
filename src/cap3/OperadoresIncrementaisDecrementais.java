package cap3;

public class OperadoresIncrementaisDecrementais {
	public static void main(String args[]){
		int x = 3;
		System.out.println("resultado: " + (++x + 2)); // pr�-incremental
		System.out.println("valor de x: " + x);
		
		x = 3;
		System.out.println("resultado: " + (x++ + 2)); // p�s-incremental
		System.out.println("valor de x: " + x);

		System.out.println("---------------------------------------------------------");
		
		x = 3;
		System.out.println("resultado: " + (--x + 2)); // pr�-decremental
		System.out.println("valor de x: " + x);
		
		x = 3;
		System.out.println("resultado: " + (x-- + 2)); // p�s-decremental
		System.out.println("valor de x: " + x);
	}
}
