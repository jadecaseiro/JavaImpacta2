package cap9.primeirodesafio;

public class Funcionario {
	String nome;
	int idade;
	double salario;

	void setNome(String nome) {
		this.nome = nome;

	}

	void setIdade(int idade) {
		this.idade = idade;

	}

	void setSalario(double salario) {
		this.salario = salario;
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
		System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSalario: " + getSalario());
		
	}

}
