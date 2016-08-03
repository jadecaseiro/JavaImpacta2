package cap13.exemplos2;

public class Executando9 {
	public static void main(String[] args) {
		Produto produto = new Produto("Sapato 1", 36);
		OperacaoAritmetica funcao1 = produto::aumentarPreco;
		System.out.println(funcao1.execute(150, 10));
	}

}
