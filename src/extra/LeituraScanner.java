package extra;

import java.util.Scanner;

public class LeituraScanner {

	public static void main(String[] args) {
		Scanner numeros = new Scanner (System.in);
		double resultado;
		System.out.println("Digite o primeiro valor");
		double num1 = numeros.nextDouble();
		
		System.out.println("Digite o segundo valor");
		double num2 = numeros.nextDouble();
		
		resultado = num1 + num2;
		
		System.out.println(resultado);
	}

}
