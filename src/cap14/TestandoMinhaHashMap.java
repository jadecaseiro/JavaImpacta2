package cap14;

import java.util.HashMap;

public class TestandoMinhaHashMap {

	public static void main(String[] args) {
		
		MinhaHashMap<String, Integer> pessoaMap = new MinhaHashMap<>();
		pessoaMap.put("Roberto", 35);
		pessoaMap.qualquer();
		System.out.println(pessoaMap);
	}

}
