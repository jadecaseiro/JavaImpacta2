package cap3.lab;

public class Laboratorio3 {
	public static void main(String[] args) {
		double valorCompra = 3500;
		double valorPagar;
		valorPagar = valorCompra <= 1000 ? valorCompra :
					 valorCompra <= 3000 ? valorCompra * 0.95 :
					 valorCompra* 0.9;
				
		System.out.println(valorPagar);
				
	}

}
