package cap6.lab1;

public class Carro {
	private String modelo;
	private int potenciaMotor;
	private String cor;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void imprime(){
		System.out.println( "Cor: " + 
				getCor() + "\nModelo: " +
				getModelo() + "\nPotencia: " +
				getPotenciaMotor());
	}
}
