package cap4;

public class ExemploIfElseCascata {
	public static void main(String[] args) {
		int hora = 10;
		if (hora <12){
			System.out.println("Bom dia");
			//manipula��o de variavel dentro do escopo - OK
			hora*=10; 
			//int teste = 7; Variavel criada dentro do escopo if
		} else if (hora <18){
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}//Teste manupula��o de vari�vel dentro do escopo - OK
		System.out.println(hora); 
		// System.out.println(teste); Tentativa de usar variavel criada dentro do escopo if
	}

}
