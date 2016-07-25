package cap9.terceirodesafio;

public class Chefe extends Funcionario {
	private String celular;

	void setCelular(String celular) {
		this.celular = celular;

	}

	String getCelular() {
		return celular;
	}
	void setDados(String nome, double salario, int idade, String celular){
		setDados(nome, salario, idade);
		setCelular(celular);
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("\nCelular: " + getCelular());
		System.out.println("-------------");
	}
}
