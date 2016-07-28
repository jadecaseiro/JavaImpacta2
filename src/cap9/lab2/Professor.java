package cap9.lab2;

public class Professor extends Pessoa {

	private float salario;
	private String disciplina;

	public Professor(String nome, int idade, char sexo, int numero,
			String dataNasc, float salario, String disciplina) {
		super(nome, idade, sexo, new RG(numero, dataNasc));
		setSalario(salario);
		setDisciplina(disciplina);

	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public void falar(String fala){
		System.out.println(getNome() + ": " + fala);
	}
	public void mostrarDados(){
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Numero RG: " + getRg().getNumero());
		System.out.println("Data Nascimento: " + getRg().getDataNasc());
		System.out.println("Salario: " + getSalario());
		System.out.println("Disciplina: " + getDisciplina());
	}

}
