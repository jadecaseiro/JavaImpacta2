package cap13.exemplos;

public class Executando4 {
	public static void main(String[] args) {
		ExemploFuncional1 funcionario = (n, i, s) -> {
			String nomeMaiusculo = n.toUpperCase();
			if (i < 18) {
				System.out.println("Funcionario nao pode ser contratado!");
			} else {
				System.out.println("Funcionario " + nomeMaiusculo
						+ " recebe salário " + s);
			}
		};
		funcionario.exibeDados("Joaquim", 20, 1000);
	}
}
