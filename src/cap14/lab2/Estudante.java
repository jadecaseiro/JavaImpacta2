package cap14.lab2;

public class Estudante {
	private String nome;
	double notaMatematica;
	double notaPortugues;
	double media;
	
	Estudante(String nome, double notaMatematica, double notaPortugues){
		setNome(nome);
		setNotaMatematica(notaMatematica);
		setNotaPortugues(notaPortugues);
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaPortugues() {
		return notaPortugues;
	}
	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}

}
