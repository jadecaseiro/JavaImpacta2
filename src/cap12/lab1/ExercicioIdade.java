package cap12.lab1;

import java.util.Scanner;

public class ExercicioIdade {
	public static void main(String[] args) {

		// String anoDeNascimento;

		try {
			Scanner ano = new Scanner(System.in);

			System.out.println("Digite o ano de nascimento.");
			String anoDeNasc = ano.nextLine();

			int anoDeNascimento = Integer.parseInt(anoDeNasc);

			int idade = 2014 - anoDeNascimento;
			System.out.println(idade);
		} catch (Exception e) {
			System.out.println("Valor digitado inválido");
		}

	}
}
