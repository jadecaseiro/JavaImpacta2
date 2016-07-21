package cap6;

public class UsaPessoa {
	public static void main(String[] args) {
		int x = 10; // x é uma variável local de método que guarda um tipo
					// primitivo
//		int y;
//		String s = "Texto";// x é uma variável local de método que guarda um
							// tipo constuído
		System.out.println("x: " + x);
		// System.out.println("y: " + y);// Variaveis locais de método devem ser
		// inicializadas para que sejam usadas

		// Instanciando a classe Pessoa
		Pessoa p; // variável de referencia (objeto)
		p = new Pessoa();

//		Pessoa p1 = new Pessoa();

		System.out.println(p);
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Estado Civil: " + p.estadoCivil);
		// Inicializando valores para os atributos de p

		p.nome = "João";
		p.idade = 22;
		p.sexo = 'm';
		System.out.println("------------- Acesso via mostrarDados -----------");

		System.out.println("---------------- ------------");
		System.out.println(" \nNome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Estado Civil: " + p.estadoCivil);

		System.out.println("---------------- Acesso via métodos ------------");

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
