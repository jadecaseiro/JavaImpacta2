package cap10.lab2;

public class Apostila implements Vendavel {
	private String materia;

	Apostila(String materia){
		setMateria(materia);
	}
	
	public String toString() {
		return "Apostila de "+ getMateria() + " ";
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getPreco(int modalidade) {
		if (modalidade == 1)
			return 50;
		else
			return 90;
	}

}
