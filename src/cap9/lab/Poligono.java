package cap9.lab;

abstract public class Poligono {
	
	private double area;
	
	

	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	abstract void calcularArea();
	abstract void imprimir();
	
	
	
}
