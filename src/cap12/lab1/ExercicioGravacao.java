package cap12.lab1;

import java.io.PrintWriter;
import java.util.Scanner;

public class ExercicioGravacao {
	public static void main(String[] args) {
		System.out.println("Digite uma frase");
		Scanner frase = new Scanner(System.in);
		String texto = frase.nextLine();
		try {
			PrintWriter writer = new PrintWriter("C:\\doc1.txt");
			writer.println(texto);
			writer.close();
		} catch (java.io.FileNotFoundException e) {
			System.out.println("Falha ao gravar informações digitadas");

		}
		System.out.println("CONTINUANDO O PROGRAMA");
//		finally{
//			System.out.println("CONTINUANDO O PROGRAMA");
//		}

	}

}
