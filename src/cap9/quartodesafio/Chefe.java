package cap9.quartodesafio;

public class Chefe extends Funcionario {
	private String celular;

	public Chefe(String nome, double salario, int idade, String celular) {
		super(nome, salario, idade);
		setCelular(celular);

	}

	void setCelular(String celular) {
		this.celular = celular;

	}

	String getCelular() {
		return celular;
	}

	void setDados(String nome, double salario, int idade, String celular) {
		setDados(nome, salario, idade);
		setCelular(celular);
	}
	void reajustarSalario(){
		setSalario(getSalario() + 100);
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("\nCelular: " + getCelular());
		System.out.println("-------------");
	}
}
