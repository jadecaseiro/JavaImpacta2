package cap9.lab2;

public class Cap9_Lab2 {
	public static void main(String[] args) {
		Pessoa a1 = new Aluno("Jade", 26, 'F', 477449438,
				"21/06/1990", 2600, "ADS");
		Pessoa a2 = new Aluno("João", 20, 'M', 488889438,
				"10/09/1995", 1000, "AD");
		Pessoa p1 = new Professor("Carlos", 55, 'M', 888555222,
				"05/05/1958", 5500, "Programação");

		p1.falar("oi, sou o Professor");
		a2.falar("oi, sou o Aluno 2");
		a1.falar("oi, sou o Aluno 1");
		
		System.out.println("--------Professor 1 ----------");
		p1.mostrarDados();
		System.out.println("--------Aluno 2 ----------");
		a2.mostrarDados();
		System.out.println("--------Aluno 1 ----------");
		a1.mostrarDados();
	}

}
