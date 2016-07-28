package cap9.quintodesafio.geral;

public abstract class Funcionario {
	private String nome;
	protected double salario;
	private int idade;
	public Endereco endereco;

	public Funcionario(String nome, double salario, int idade, Endereco endereco) {
		setNome(nome);
		setSalario(salario);
		setIdade(idade);
		setEndereco(endereco);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public int getIdade() {
		return idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public abstract void reajustarSal();

	public void imprimir() {
		System.out.println("Dados de " + this);
		System.out.println("nome: " + getNome());
		System.out.println("idade: " + getIdade());
		System.out.println("salário: " + getSalario());
		System.out.println("endereço: " + getEndereco().getDados());
	}
}