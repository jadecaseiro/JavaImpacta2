package cap6;

public class UsaPessoa {
	public static void main(String[] args) {
		int x = 10; // x � uma vari�vel local de m�todo que guarda um tipo
					// primitivo
//		int y;
//		String s = "Texto";// x � uma vari�vel local de m�todo que guarda um
							// tipo constu�do
		System.out.println("x: " + x);
		// System.out.println("y: " + y);// Variaveis locais de m�todo devem ser
		// inicializadas para que sejam usadas

		// Instanciando a classe Pessoa
		Pessoa p; // vari�vel de referencia (objeto)
		p = new Pessoa();

//		Pessoa p1 = new Pessoa();

		System.out.println(p);
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Estado Civil: " + p.estadoCivil);
		// Inicializando valores para os atributos de p

		p.nome = "Jo�o";
		p.idade = 22;
		p.sexo = 'm';
		System.out.println("------------- Acesso via mostrarDados -----------");

		System.out.println("---------------- ------------");
		System.out.println(" \nNome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Estado Civil: " + p.estadoCivil);

		System.out.println("---------------- Acesso via m�todos ------------");

		Pessoa pes1 = new Pessoa();
		pes1.setDados("Nome1", 20, 'f', false);
		pes1.getDados();
		pes1.imprimir();

		// p.setNome("Maria");
		// System.out.println("nome: " + p.getNome());
		// p.setIdade(26);
		// System.out.println("idade: " + p.getIdade());
	}

}
