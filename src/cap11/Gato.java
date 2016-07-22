package cap11;

public class Gato {
	private String nome;
	private int idade;

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
	
	public String toString(){
		return "Nome: " + getNome() + "\nIdade: " + getIdade();
	}
	
	public void mostrarDados() {
		System.out.println("Nome: " + getNome() + "\nIdade: " + getIdade());
	}
}
