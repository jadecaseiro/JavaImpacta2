package cap7;

public class Vendedor {
	private String nome; // variavel de instancia
	private static double premioEquipe = 100; // variavel de classe
	/* Variavel marcadas como static são variaveis de classe
	* Não vão depender de instancia para existirem
	* Ou seja, na classe "GerandoVendas" não precisa ser invocada por meio
	* do objeto e sim pelo nome da Classe
	*/
	
	
	private double premioIndividual = 200; // variavel de instancia

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPremioEquipe(double premioEquipe) {
		Vendedor.premioEquipe += premioEquipe;
	}

	public void setPremioIndividual(double premioIndividual) {
		this.premioIndividual += premioIndividual;
	}

	public String getNome() {
		return nome;
	}

	public double getPremioEquipe() {
		return premioEquipe;
	}

	public double getPremioIndividual() {
		return premioIndividual;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + getNome() + "\nPremio Equipe: "
				+ getPremioEquipe() + "\nPremio Individual: "
				+ getPremioIndividual() + "\n-----------------");
	}

}
