package cap10;

public class Geladeira implements Eletrodomestico {
	private double temperatura;

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public void ligar() {
		System.out.println("Ligando a Geladeira");

	}

	public void desligar() {
		System.out.println("Desligando a Geladeira");

	}

	public void descongelar() {
		System.out.println("Descongelando a Geladeira");

	}

}
