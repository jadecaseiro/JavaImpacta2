package cap9.segundodesafio;

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
	void setDados(String nome, double salario, int idade, String linguagem){
		setDados( nome,  salario, idade);
		setLinguagem(linguagem);
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("\nLinguagem: " + getLinguagem());
		System.out.println("-------------");
	}
}
