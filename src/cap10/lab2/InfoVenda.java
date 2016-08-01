package cap10.lab2;

public class InfoVenda{
	public static void main(String[] args) {

		JavaProgrammer cursoJava = new JavaProgrammer("Java Programmer", 40,
				8.0);
		Redes cursoRedes = new Redes("Redes", 10, "Linux");

		cursoInfo(cursoJava, 1); // Invocando o método cursoInfo
		cursoInfo(cursoRedes, 1);
	}

	/*
	 * Abaixo, a definição do método cursoInfo
	 */
	static void cursoInfo(Vendavel curso, int modalidade) {
		System.out.println("\nEscola: " + Vendavel.ESCOLA);
		System.out.println("Telefone: " + Vendavel.TELEFONE);
		
		System.out.println(curso);
		double valor;
		valor = curso.getPreco(modalidade);
		System.out.print("Custa: " + valor  + "\n" );
		

	}
	/* 
	 * b) conter o método cursoInfo, que deverá receber como parâmetros o objeto
	 * Vendavel e a modalidade, para que possa imprimir na tela as informações
	 * ESCOLA, TELEFONE e o preço.
	 * 
	 * A saída desta classe deve ser:
	 * 
	 * Escola: Impacta 
	 * Fone: 11 3254 2200 
	 * Nome do Curso: Java Programmer 
	 * Carga Horária: 40 
	 * Versão da Linguagem: 8.0 
	 * custa: 1320.0
	 */
}
