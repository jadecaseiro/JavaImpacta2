package cap3;

public class OperadorTernario {
	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		String teste = a +b > b-a ? "Sim" : "N�o";
		boolean teste2 = a+b > b-a ;
		String teste3 = teste2 ? "Sim" : "N�o";
		String teste4 = true ? "Sim" : "N�o";
		
		System.out.println(a +b > b-a ? "Sim" : "N�o");
		System.out.println(teste);
		System.out.println(teste2);
		System.out.println(teste3);
		System.out.println(teste4);
	}
}
