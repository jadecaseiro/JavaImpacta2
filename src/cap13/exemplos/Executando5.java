package cap13.exemplos;

public class Executando5 {
	public static void main(String[] args) {
		ExemploFuncional1 funcao = (n, i, s) -> System.out.println(n
				+ " recebe " + s);
		funcao.exibeDados("Manuel", 90, 5000);
	}

}
