package cap6;

public class Racao {
	int tipo;
	String marca;

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
	public void mostrarDados(){
		System.out.println("Tipo: " + getTipo());
		System.out.println("Marca: " + getMarca());
	}
	
}
