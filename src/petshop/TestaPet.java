package petshop;

import cap6.Cachorro;
import cap6.Racao;

public class TestaPet {
	public static void main(String[] args) {

		Cachorro c3 = new Cachorro();
		Racao r2 = new Racao();

		c3.setNome("Spider");
		c3.setIdade(5);
		c3.setRaca("PitBull");
		c3.mostrarDados();

		r2.setTipo(1);
		r2.setMarca("Pedigree");
		r2.mostrarDados();
	}
}