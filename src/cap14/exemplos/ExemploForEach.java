package cap14.exemplos;

import java.util.TreeSet;

public class ExemploForEach {
	public static void main(String[] args) {
		TreeSet<String> cursos = new TreeSet<>();
		
		cursos.add("PHP");
		cursos.add("Java");
		cursos.add("Linux");
		cursos.add("ASP");
		cursos.add("Delphi");
		
		System.out.println("Cursos em ordem alfabética: \n");
		
		cursos.forEach(c -> System.out.println("Curso: " + c));
		
		//TreeSet ordena em ordem alfabetica
		
	}

}
