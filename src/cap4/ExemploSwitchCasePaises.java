package cap4;

public class ExemploSwitchCasePaises {
	public static void main(String[] args) {
		String pais = "Brasil";
		switch (pais) {
		case "Brasil":
		case "Portugal":
			System.out.println("Bom dia!");
			break;
		case "França":
			System.out.println("Bon Jour!");
			break;
		case "Mexico":
		case "Argentina":
		case "Espanha":
			System.out.println("Buenos dias!");
			break;
		default:
			System.out.println("Good Morning!");

		}
	}

}
