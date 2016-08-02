package cap12.lab;

public class Nota {
	private String aluno;
	private int nota;

	public Nota(String aluno, int nota) throws NotaInvalidaException {

		setAluno(aluno);
		setNota(nota);
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public int getNota() {
		return nota;
	}

	public void mostrarDados() {
		System.out.println("Nome: " + aluno + " Nota: " + nota);

	}

	public void setNota(int nota) throws NotaInvalidaException {
		if (nota < 0 || nota > 10) {
			NotaInvalidaException e = new NotaInvalidaException();
			throw e;
		} else {
			this.nota = nota;
		}
	}

}
