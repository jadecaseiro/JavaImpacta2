package cap6.lab1;

public class Funcionario {
	private String nome;
	private String sobrenome;
	private String cargo;
	private double salario;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getCargo() {
		return cargo;
	}

	public double getSalario() {
		return salario;
	}
	
	public void mostraDados(){
		System.out.println("Nome: " + getNome()+ " " 
				+ getSobrenome() +  "\nCargo: " 
				+ getCargo() + "\nSalario: " + getSalario());
	}

}
