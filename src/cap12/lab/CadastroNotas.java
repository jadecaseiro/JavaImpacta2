package cap12.lab;

public class CadastroNotas {
	public static void main(String[] args) {

		try {
			Nota n = new Nota("Maria", 8);
			n.mostrarDados();
		} catch (NotaInvalidaException e) {
			System.out.println("Nota Inválida");
		}

	}
}
