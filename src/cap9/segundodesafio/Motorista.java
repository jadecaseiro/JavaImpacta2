package cap9.segundodesafio;

public class Motorista extends Funcionario {
	int cnh;

	void setCnh(int cnh) {
		this.cnh = cnh;

	}

	int getCnh() {
		return cnh;
	}

	void reajustarSalario() {
		salario += 200;
	}
	void setDados(String nome, double salario, int idade, int cnh){
		setDados( nome, salario, idade);
		setCnh(cnh);
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("\nCNH: " + getCnh());
		System.out.println("-------------");
	}

}
