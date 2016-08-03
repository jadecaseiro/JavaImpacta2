package cap13.exemplos2;

public class Executando8 {
	public static void main(String[] args) {
		OperacaoAritmetica funcao = FinancialUtils::calculaJuros;
		System.out.println(funcao.execute(1200, 8.3));
	}

}
