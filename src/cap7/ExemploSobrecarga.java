package cap7;

public class ExemploSobrecarga {
	public static void main(String args[]) {
		Sobrecarga sob = new Sobrecarga();
		sob.mostrar("Ernesto");
		sob.mostrar("Ernesto", "da Silva");
		sob.mostrar();
		sob.mostrar(38);
		sob.mostrar("Maria", 52);
		sob.mostrar(52, "Maria");
		
	}
}
