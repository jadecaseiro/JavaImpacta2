package cap6.lab1;

public class Garagem {
	Carro carroPasseio = new Carro();
	Carro carroUtilitario = new Carro();

	public static void main(String[] args) {
		
		Garagem g = new Garagem();
		g.carroPasseio.setCor("Amarelo");
		g.carroPasseio.setModelo("Onix");
		g.carroPasseio.setPotenciaMotor(80);
		
		g.carroUtilitario.setCor("Preto");
		g.carroUtilitario.setModelo("Gol");
		g.carroUtilitario.setPotenciaMotor(100);

		// System.out.println("Carro Passeio \n" + "Cor: " +
		// g.carroPasseio.getCor() + "\nModelo: " +
		// g.carroPasseio.getModelo() + "\nPotencia: " +
		// g.carroPasseio.getPotenciaMotor());
		
		System.out.println("Carro Passeio");
		g.carroPasseio.imprime();
		System.out.println("----------------------");
		System.out.println("Carro Utilitário");
		g.carroUtilitario.imprime();

	}

}
