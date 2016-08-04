package cap14.exemplos;

import java.util.HashSet;
import java.util.Set;

public class ExemploRemoveIf {
	public static void main(String[] args) {
		
		Set<Produto> produtos = new HashSet<>();
		
		produtos.add(new Produto("Leite", "Laticinio", 5.8));
		produtos.add(new Produto("Leite2", "Laticinio2", 5.89));
		produtos.add(new Produto("Leite8", "Laticinio8", 2.3));
		produtos.add(new Produto("Leite12", "Laticinio",7.8));
		produtos.add(new Produto("Leite", "Laticinio", 5.8));
		
		produtos.removeIf(p -> p.getPreco()> 2.5);
		
		produtos.forEach(p -> System.out.println("Produtos menor que R$2,5: " + p));
		
		
		
	}

}
