package cap19;

public class ExemploObjetoPerdido {
	public static void main(String args[]){
		
		String teste = new String("Java");
		System.out.println(teste);
		teste = null; // Agora, o objeto StringBuffer est� sem refer�ncias,
		// ou seja, qualificado para coleta
		System.out.println(teste);
	}
}
