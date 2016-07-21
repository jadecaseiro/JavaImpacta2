package cap7;

public class GerandoVendas2 {

	public static void main(String[] args) {
		Vendedor v1 = new Vendedor();
		Vendedor v2 = new Vendedor();

		v1.setNome("Jo�o");
		v2.setNome("Maria");

		v1.mostrarDados();
		v2.mostrarDados();

		System.out.println("\nAtribuindo valores aos pr�mios de v1(Jo�o)");

		v1.setPremioIndividual(200);
		v1.setPremioEquipe(500);
		v1.mostrarDados();

		System.out.println("\nMostrando os valores de v2 (Maria) sem ter feito atribui��es");

		v2.mostrarDados();

		System.out.println("\nCriando v3 (Cida) testando a vari�vel de classe");

		Vendedor v3 = new Vendedor();
		v3.setNome("Cida");
		v3.setPremioEquipe(-300);
		v3.setPremioIndividual(800);
		v3.mostrarDados();

		System.out.println("\nMostrando novamente os tr�s objetos");
		
		v1.mostrarDados();
		v2.mostrarDados();
		v3.mostrarDados();

	}

}
