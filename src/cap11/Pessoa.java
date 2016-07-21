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

	public void mostrarDados(Pessoa[] p) {
		for(int i=0; i < p.length ; i++ ){
		System.out.println("Nome: " + p[i].getNome() + "\nPeso: " + p[i].getPeso()
				+ "\nAltura: " + p[i].getAltura());
	}}

}
