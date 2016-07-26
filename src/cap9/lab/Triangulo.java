package cap9.lab;

public class Triangulo extends Poligono {
	private double base;

	private double altura;

	public Triangulo(double base, double altura) {
		setBase(base);
		setAltura(altura);
	
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	void calcularArea() {
	
		setArea((base * altura) / 2);
	
	}

	void imprimir() {
		System.out.println("Triangulo [ Base: " + base + " Altura: " + altura
				+ " Area: " + getArea() + "]");
	}
}
