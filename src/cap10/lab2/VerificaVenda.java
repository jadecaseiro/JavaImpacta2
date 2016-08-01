package cap10.lab2;

public class VerificaVenda {

	public static void main(String[] args) {
		JavaProgrammer cursoJava = new JavaProgrammer("Java Programmer", 40, 8.0);
		Redes cursoRedes = new Redes("Redes", 40, "Linux");
		Apostila apostilaExcel = new Apostila("Excel");
		cursoInfo(apostilaExcel, 2);
		cursoInfo(cursoJava, 1);
		cursoInfo(cursoRedes, 2);
		
		System.out.println("\nOUTRA FORMA\n");
		informarCursos(cursoJava, 2);
		informarCursos(cursoRedes, 1);

	}

	static void cursoInfo(Vendavel curso, int mod) {
		System.out.println("Escola: " + Vendavel.ESCOLA + "\nFone: "
				+ Vendavel.TELEFONE);
		System.out.println(curso + "custa: " + curso.getPreco(mod));
		System.out
				.println("------------------------------------------------------");
	}

	static void informarCursos(Curso c, int mod) {
		if (c instanceof JavaProgrammer) {
			c.mostrarDados();
			((JavaProgrammer) c).getPreco(mod);
		} else {
			((Redes) c).mostrarDados();
			((Redes) c).getPreco(mod);
		}
	}
}
