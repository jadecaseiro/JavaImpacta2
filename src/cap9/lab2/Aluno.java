package cap9.lab2;

public class Aluno extends Pessoa {
	private float mensalidade;
	private String curso;

	public Aluno(String nome, int idade, char sexo, int numero,
			String dataNasc, float mensalidade, String curso) {
		super(nome, idade, sexo, new RG(numero, dataNasc));
		setMensalidade(mensalidade);
		setCurso(curso);

	}

	public float getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void falar(String fala){
		System.out.println(getNome() + ": " + fala);
	}
	public void mostrarDados(){
		System.out.println("\n--------Aluno " + getNome() +"----------");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Numero RG: " + getRg().getNumero());
		System.out.println("Data Nascimento: " + getRg().getDataNasc());
		System.out.println("Mensalidade: " + getMensalidade());
		System.out.println("Curso: " + getCurso());
	}

}
