package cap9.quintodesafio;

import cap9.quintodesafio.geral.Endereco;
import cap9.quintodesafio.geral.Funcionario;

class Motorista extends Funcionario {
	private int cnh;

	Motorista(String nome, double salario, int idade, int cnh,Endereco endereco) {
		super(nome, salario, idade,endereco);
		this.cnh = cnh;
	}

	
	public String toString() {
		return "Motorista";
	}
	
	void setNrToques(int cnh) {
		this.cnh = cnh;
	}

	int getCnh() {
		return cnh;
	}

	public void reajustarSal() {
		setSalario(getSalario() + 100);
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("CNH: " + getCnh());
		System.out.println("------------------------------------------------------");
	}
}
