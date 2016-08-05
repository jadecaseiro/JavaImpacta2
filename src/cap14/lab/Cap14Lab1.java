package cap14.lab;

import java.util.HashMap;
import java.util.Map;

public class Cap14Lab1 {
	public static void main(String[] args) {
		Map<String, Integer> pessoaMap = new HashMap<>();

		pessoaMap.put("João", 80);
		pessoaMap.put("Maria", 15);
		pessoaMap.put("Claudio", 30);
		pessoaMap.put("Caio", 25);
		
		System.out.println(pessoaMap.get("João"));
		System.out.println(pessoaMap.get("Maria"));
		System.out.println(pessoaMap.get("Claudio"));
		System.out.println(pessoaMap.get("Caio"));
		
		pessoaMap.forEach((n,i) -> System.out.println("Nome: "+ n + " Idade: " + i));
		
		
	}

}
