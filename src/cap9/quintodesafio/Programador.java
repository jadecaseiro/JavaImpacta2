package cap9.quintodesafio;

import cap9.quintodesafio.geral.Endereco;
import cap9.quintodesafio.geral.Funcionario;

public class Programador extends Funcionario {
	private String linguagem;

	Programador(String nome, double salario, int idade, String linguagem, String logradouro, int nr, String bairro) {
		super(nome, salario, idade, new Endereco(logradouro, nr, bairro));
		this.linguagem = linguagem;
	}

	String getLinguagem() {
		return linguagem;
	}

	public void reajustarSal() {

		setSalario(getSalario() + 100);
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Linguagem: " + getLinguagem());
		System.out.println("------------------------------------------------------");
	}

}
