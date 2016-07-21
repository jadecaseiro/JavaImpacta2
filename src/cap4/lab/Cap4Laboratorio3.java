package cap4.lab;

public class Cap4Laboratorio3 {
	
	public static void main(String[] args) {
		for (int ano = 1930; ano <= 2016; ano += 4) {
			if (ano == 1942 || ano == 1946)
				continue;
			System.out.println("Copa do Mundo de " + ano +"!");
		}
	}
}
