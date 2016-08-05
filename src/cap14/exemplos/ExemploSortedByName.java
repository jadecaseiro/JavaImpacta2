package cap14.exemplos;

import java.util.ArrayList;
import java.util.List;

public class ExemploSortedByName {
	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		
		lista.add(new Funcionario(7777, "joao", "programador", 8000));
		lista.add(new Funcionario(7227, "maria", "Secretaria", 800));
		lista.add(new Funcionario(3377, "Jose", "programador", 8000));
		lista.add(new Funcionario(5577, "Marcia", "jornalista", 5500));
		lista.add(new Funcionario(8896, "ana", "programador", 8000));
		
		lista.stream().sorted((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
	}
}
