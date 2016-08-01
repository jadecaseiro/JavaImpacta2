package cap10.lab2;


public class JavaProgrammer extends Curso implements Vendavel {
	private double versaoDaLinguagem;

	public JavaProgrammer(String nomeCurso, int cargaHoraria, double versaoDaLinguagem) {
		super(nomeCurso, cargaHoraria);
		setVersaoDaLinguagem(versaoDaLinguagem);
	}
	
	public double getVersaoDaLinguagem() {
		return versaoDaLinguagem;
	}

	public void setVersaoDaLinguagem(double versaoDaLinguagem) {
		this.versaoDaLinguagem = versaoDaLinguagem;
	}

	public String toString() {
		return "Nome do Curso: " + getNomeCurso() + 
			   "\nCarga Horária: " + getCargaHoraria() + 
			   "\nVersão da Linguagem: " + getVersaoDaLinguagem() + "\n";
	}

	public double getPreco(int modalidade) {
		if (modalidade == 1)
			return 780;
		else
			return 1320;
	}
}






