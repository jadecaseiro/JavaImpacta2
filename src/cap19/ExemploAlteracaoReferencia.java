package cap19;

public class ExemploAlteracaoReferencia {
	public static void main(String args[]){
		
		String teste1 = new String("Cliente");
		String teste2 = new String("Especial");
		System.out.println(teste1);
		System.out.println(teste2);
		
		teste1 = teste2;
		
		System.out.println(teste1);
		System.out.println(teste2);
	}
}
