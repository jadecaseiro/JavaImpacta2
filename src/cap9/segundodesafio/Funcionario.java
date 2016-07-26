package cap9.segundodesafio;

public class Funcionario {
	private String nome;
	private int idade;
	private double salario;

	void setNome(String nome) {
		this.nome = nome;

	}

	void setIdade(int idade) {
		this.idade = idade;

	}

	void setSalario(double salario) {
		this.salario = salario;
	}
	
	void setDados(String nome, double salario, int idade ){
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
		
	}

	String getNome() {
		return nome;
	}

	int getIdade() {
		return idade;
	}

	double getSalario() {
		return salario;
	}

	void reajustarSalario() {
		salario += 100;
	}

	void imprimir() {
		System.out.println("\nNome: " + getNome() + "\nIdade: " + getIdade() + "\nSalario: " + getSalario());
		
	}

}
