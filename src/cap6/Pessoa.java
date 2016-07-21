package cap6;

public class Pessoa {
	String nome; // Variável de instancia(dentro de classe, não de método)
	int idade; // ou Atributo, ou caracteristica
	char sexo;
	boolean estadoCivil;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public boolean getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(boolean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	void setDados(String nome, int idade, char sexo, boolean estadoCivil) {
		setNome(nome);
		setSexo(sexo);
		setEstadoCivil(estadoCivil);
		setIdade(idade);
	}

	String getDados() {
		return "Nome: " + getNome() + " " + "\nIdade: " + getIdade()
				+ "\nSexo: " + getSexo() + "\n Estado Civil: "
				+ getEstadoCivil();

	}

	void imprimir() {
		System.out.println(getDados());
	}
}
