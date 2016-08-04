package cap14;

import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;


public class VariosExemplos {

	public static void main(String[] args) {

		// TreeSet garante que a ordem dos elementos seja ascendente, tomando
		// por base sua ordem natural - n�o permite duplica��es - Descendente de conjuntos

		System.out.println("--Com TreeSet ---------------------------------");

		Set<String> cursos = new TreeSet<>();

		cursos.add("PHP");
		cursos.add("PHP");
		cursos.add("Linux");
		cursos.add("Asp");
		cursos.add("Java");
		cursos.add("Delphi");

		for (String curso : cursos) {
			System.out.println("Curso: " + curso);
		}

		System.out.println(cursos);
		
//		HashSet � um conjunto n�o ordenado e n�o classificado, que n�o
//		permite duplica��es entre seus elementos.
		
		System.out.println("--Com HashSet ---------------------------------");

		Set<String> cursos3 = new HashSet<>();
		cursos3.add("PHP");
		cursos3.add("PHP");
		cursos3.add("Linux");
		cursos3.add("Asp");
		cursos3.add("Java");
		cursos3.add("Delphi");

		for (String curso : cursos3) {
			System.out.println("Curso: " + curso);
		}

		System.out.println(cursos3);

//		ArrayList permite realizar acesso aleat�rio r�pido, bem como itera��o. 
//		� ordenada pelo �ndice e n�o � classificada - permite duplica��es
		
		System.out.println("--Com ArrayList ---------------------------------");

		List<String> cursos2 = new ArrayList<>();

		cursos2.add("PHP");
		cursos2.add("PHP");
		cursos2.add("Linux");
		cursos2.add("Asp");
		cursos2.add("Java");
		cursos2.add("Delphi");

		for (String curso : cursos2) {
			System.out.println("Curso: " + curso);
		}

		System.out.println(cursos2);

//		HashMap n�o � ordenada nem classificada. � r�pida na busca/inser��o de dados
//		- permite duplica��es
		
		System.out.println("--Com HashMap ---------------------------------");

		Map<String, String> cursos4 = new HashMap<>();

		cursos4.put("a", "PHP");
		cursos4.put("b", "PHP");
		cursos4.put("c", "Linux");
		cursos4.put("d", "ASP");
		cursos4.put("e", "Java");
		cursos4.put("f", "Delphi");

		for (String curso : cursos4.values()) {
			System.out.println(curso);
		}

		System.out.println(cursos4);

	}
}
