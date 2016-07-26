package cap9.lab;


public class CalculoAreaPoligonos {

	
	public static void main(String[] args) {
		
		Poligono [] figuras = new Poligono [4];
		figuras[0] = new Triangulo(15, 20);
		figuras[1] = new Triangulo(7, 4);
		figuras[2] = new Quadrado(10);
		figuras[3] = new Quadrado(3);
		
		
		
		for(int i = 0; i<figuras.length; i++){
			figuras[i].calcularArea();
			figuras[i].imprimir();
		}

	}
}
/*
 * Crie as classes necess�rias para que a seguinte
 * sa�da seja executada:
 * 
 * Triangulo [altura=20.0, base=15.0, �rea: 150.0]
 * Triangulo [altura=4.0, base=7.0, �rea: 14.0]
 * Quadrado [lado=10.0, �rea: 100.0]
 * Quadrado [lado=3.0, �rea: 9.0]
 * 

 * Observa��o: deve ser proibida a instancia��o
 * de objetos pelo supertipo Poligono
 * 
 */

