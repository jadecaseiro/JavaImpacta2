package cap13;

public class UsaOperacaoAritmetica {
	public static void main(String[] args) {

		OperacaoAritmetica soma = new Soma();
		System.out.println(soma.execute(4, 8));

		OperacaoAritmetica subtracao = new Subtracao();
		System.out.println(subtracao.execute(4, 8));

		OperacaoAritmetica divisao = new Divisao();
		System.out.println(divisao.execute(4, 8));

		OperacaoAritmetica multiplicacao = new Multiplicacao();
		System.out.println(multiplicacao.execute(4, 8));
//Implementa a operação a ser realizada atraves de uma expressao lambda
		
		
		
		
		
		OperacaoAritmetica operacao = (x, y) -> x+y;
		System.out.println(operacao.execute(50,2));
		
		operacao = (x, y) -> x-y;
		System.out.println(operacao.execute(50,2));
		
		operacao = (x, y) -> x/y;
		System.out.println(operacao.execute(50,2));
		
		operacao = (x, y) -> x*y;
		System.out.println(operacao.execute(50,2));
	}

}
