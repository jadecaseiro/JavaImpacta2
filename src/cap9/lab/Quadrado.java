package cap9.lab;

public class Quadrado extends Poligono {
	private double lado;

	public Quadrado(double lado) {
		setLado(lado);

	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	void calcularArea() {

		setArea(lado * lado);

	}

	void imprimir() {
		System.out.println("Quadrado [ Lado: " + lado + " Area: " + getArea()
				+ " ]");
	}
}
