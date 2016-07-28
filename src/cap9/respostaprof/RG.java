package cap9.respostaprof;

public class RG {
	private int numero;
	private String dataNasc;
	
	public RG(int numero, String dataNasc){
		this.numero = numero;
		this.dataNasc = dataNasc;
	}

	
	public String toString() {
		return "Nmero do RG: " + getNumero() + "\nData do Nascimento: " + getDataNasc();
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
}
