package cap4;

public class ExemploSwitchCase {
	public static void main(String args[]) {
		int mes = 15;
		switch (mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Mar�o");
			break;
		case 4:
			System.out.println("Abril");
			break;
		default:
			System.out.println("M�s n�o existe.");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			//break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro"); //break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;

		}
	}
}
// TENTAR COLOCAR SWITCH DENTRO DE CASE
// Pode colocar o default em qualquer lugar do c�digo, por�m utilizando o
// o break no final, sen�o, ele ir� realizar o comando ap�s o default at� o break	
