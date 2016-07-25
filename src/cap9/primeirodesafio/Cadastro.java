package cap9.primeirodesafio;

public class Cadastro {
	public static void main(String[] args) {
		Programador p1 = new Programador();
		Chefe c1 = new Chefe();
		Motorista m1 = new Motorista();
		Funcionario f1 = new Funcionario();

		p1.setIdade(20);
		p1.setNome("João");
		p1.setSalario(2000);
		p1.setLinguagem("Java");
		p1.imprimir();
		System.out.println("-------------");
		p1.reajustarSalario();
		p1.imprimir();

		c1.setIdade(45);
		c1.setNome("Maria");
		c1.setSalario(5000);
		c1.setCelular("011989741475");
		c1.imprimir();
		System.out.println("-------------");
		c1.reajustarSalario();
		c1.imprimir();

		m1.setIdade(25);
		m1.setNome("Carlos");
		m1.setSalario(2500);
		m1.setCnh(422255896);
		m1.imprimir();
		System.out.println("-------------");
		m1.reajustarSalario();
		m1.imprimir();

		f1.setIdade(99);
		f1.setNome("Julio");
		f1.setSalario(1500);
		f1.imprimir();
		System.out.println("-------------");
		f1.reajustarSalario();
		f1.imprimir();

	}
}
