package cap6;

public class UsaCachorro {
	public static void main(String[] args) {
		Cachorro c1;
		c1 = new Cachorro();
		Cachorro c2 = new Cachorro();

		c1.setIdade(2);
		c1.setNome("Totó");
		c1.setRaca("Vira-Lata");
		c2.setIdade(3);
		c2.setNome("Fifi");
		c2.setRaca("Poodle");
		
		c1.mostrarDados();
		c2.mostrarDados();
		
		
// <--------Acesso Restrito - Atributos encapsulados na classe Cachorro ->
//		
//		System.out.println("Idade cachorro 1: " + c1.idade);
//		System.out.println("Idade cachorro 2: " + c2.idade);
//		System.out.println("Nome cachorro 1: " + c1.nome);
//		System.out.println("Nome cachorro 2: " + c2.nome);
//		System.out.println("Raça cachorro 1: " + c1.raca);
//		System.out.println("Raça cachorro 2: " + c2.raca);

	}

}
