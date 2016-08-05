package cap14.lab2;

import java.util.ArrayList;
import java.util.List;

public class Cap14Lab2 {
	public static void main(String[] args) {
		List<Estudante> estudante = new ArrayList<>();

		estudante.add(new Estudante("Joana", 8.5, 8.5));
		estudante.add(new Estudante("Antônio", 6, 9));
		estudante.add(new Estudante("Mariana", 7.5, 9));
		estudante.add(new Estudante("Ricardo", 7, 6));
		estudante.add(new Estudante("Gustavo", 9.5, 10));

		estudante.forEach(e ->
		e.setMedia((e.getNotaMatematica() + e.getNotaPortugues())/2));
		estudante.forEach(e -> System.out.println("Nome: " + e.getNome() + "\nMédia: " + e.getMedia()));
	}
	

}
