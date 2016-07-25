package cap9.primeirodesafio;

public class Programador extends Funcionario {
	String linguagem;

	void setLinguagem(String linguagem) {
		this.linguagem = linguagem;

	}

	String getLinguagem() {
		return linguagem;
	}

	void reajustarSalario() {
		salario += 300;
	}

	void imprimir() {
		super.imprimir();
		System.out.println("\nLinguagem: " + getLinguagem());
		System.out.println("-------------");
	}
}
