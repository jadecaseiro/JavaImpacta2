package cap7;

public class GerandoVendas {
	public static void main(String[] args) {
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();

		v1.setNome("João");
		v1.setPremioEquipe(200);
		v1.setPremioIndividual(500);

		v2.setNome("Maria");

		v1.mostrarDados();
		v2.mostrarDados();

	}

}
