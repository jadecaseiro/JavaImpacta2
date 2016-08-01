package cap10;

public class Executa {
	public static void main(String[] args) {
		Eletrodomestico g1= new Geladeira();
		Eletrodomestico t1= new Televisao();
		Eletrodomestico m1= new Microondas();
		
		g1.ligar();
		t1.ligar();
		m1.ligar();
		
		g1.desligar();
		t1.desligar();
		m1.desligar();
		
		((Geladeira) g1).descongelar();
		((Televisao) t1).trocarCanal(); // casting de objetos
		((Microondas) m1).aquecer();
		((Microondas) m1).assar();
		
	}
}
