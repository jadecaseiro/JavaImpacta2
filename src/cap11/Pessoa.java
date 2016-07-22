package cap11;

public class Pessoa {
	private String nome;
	private double altura;
	private double peso;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String toString() {
		return getNome() + " :" + " Peso: " + getPeso() + " Altura: "
				+ getAltura();

	}

	public Pessoa(String nome, double altura, double peso) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}

	public void mostrarDados(Pessoa[] p) {
		for (Pessoa pes : p) {
			System.out.println("Nome: " + pes.getNome() + "\nPeso: "
					+ pes.getPeso() + "\nAltura: " + pes.getAltura());
		}
	}

}
