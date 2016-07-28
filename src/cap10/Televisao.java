package cap10;

public class Televisao implements Eletrodomestico {
	int canal;
	int volume;

	public void ligar() {
		System.out.println("Ligando a televisao");

	}

	public void desligar() {
		System.out.println("Desligando a televisao");

	}

	public void trocarCanal() {
		System.out.println("Trocando o canal da televisao");

	}

}
