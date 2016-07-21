package cap2;

public class Escopo {
	
public static void main(String[] args) {
	String nome = "Ana";
	{
		int idade = 10;	
		System.out.println("Nome:" + nome);
		System.out.println("Idade:" + idade);
		{
			System.out.println("Idade:" + idade);
		}
	}
	System.out.println("Nome:" + nome);
//	System.out.println("Idade:" + idade); Fora escopo

}
}
