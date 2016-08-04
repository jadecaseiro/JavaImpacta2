package cap14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ExemplosComNumeros {
	public static void main(String[] args) {

		// TreeSet garante que a ordem dos elementos seja ascendente, tomando
		// por base sua ordem natural - n�o permite duplica��es

		System.out.println("--Com TreeSet ---------------------------------");

		Set<Integer> cursos = new TreeSet<>();

		cursos.add(5);
		cursos.add(2);
		cursos.add(2);
		cursos.add(1);
		cursos.add(4);
		cursos.add(3);

		for (Integer curso : cursos) {
			System.out.println("Curso: " + curso);
		}

		System.out.println(cursos);
		
//		HashSet � um conjunto n�o ordenado e n�o classificado, que n�o
//		permite duplica��es entre seus elementos.
		
		System.out.println("--Com HashSet ---------------------------------");

		Set<Integer> cursos2 = new HashSet<>();
		cursos2.add(5);
		cursos2.add(2);
		cursos2.add(2);
		cursos2.add(1);
		cursos2.add(4);
		cursos2.add(3);

		for (Integer curso : cursos2) {
			System.out.println("Curso: " + curso);
		}

		System.out.println(cursos2);

//		ArrayList permite realizar acesso aleat�rio r�pido, bem como itera��o. 
//		� ordenada pelo �ndice e n�o � classificada
		
		System.out.println("--Com ArrayList ---------------------------------");

		List<Integer> cursos3 = new ArrayList<>();

		cursos3.add(5);
		cursos3.add(2);
		cursos3.add(2);
		cursos3.add(1);
		cursos3.add(4);
		cursos3.add(3);

		for (Integer curso : cursos3) {
			System.out.println("Curso: " + curso);
		}

		System.out.println(cursos3);

//		HashMap n�o � ordenada nem classificada. � r�pida na busca/inser��o de dados
		
		System.out.println("--Com HashMap ---------------------------------");

		Map<String, Integer> cursos4 = new HashMap<>();

		cursos4.put("a", 5);
		cursos4.put("b", 2);
		cursos4.put("c", 2);
		cursos4.put("d", 1);
		cursos4.put("e", 4);
		cursos4.put("f", 3);

		for (Integer curso : cursos4.values()) {
			System.out.println(curso);
		}

		System.out.println(cursos4);

	}
}
