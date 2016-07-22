package cap11.lab;

public class Cap11Lab2 {
	public static void main(String[] args) {
		if (args.length > 0) {
			int soma = 0;
			System.out.println("A media das idades: ");
			for (String s : args) {
				soma += Integer.parseInt(s);
				System.out.print(s + " ");
			}
			int media = (soma / args.length);
			System.out.println("é : " + media);
		} else {
			System.out.println("Entre com os valores válidos de idade.");
		}

	}

}
