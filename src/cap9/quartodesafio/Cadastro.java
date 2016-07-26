package cap9.quartodesafio;

/*Baseando-se nos arquivos do pacote 
 cap9.segundodesafio, fa�a:
 1) Altere as classes Funcionario, Programador, Chefe
 e Motorista para que ao instanciar objetos destas classes na classe Cadastro
 as informa��es sejam passadas exatamente no momento da instancia��o. Ou seja,
 os valores dos atributos de cada objeto ser�o passados pelos respectivos
 construtores - o m�todo setDados n�o ser� usado! 

 2) ATEN��O: N�O deve existir construtor padr�o
 */

public class Cadastro {
	public static void main(String args[]) {
//		Funcionario f = new Funcionario("Pedro", 1255.8, 18);
//		Funcionario f = new Funcionario();
//		f.setDados("Pedro", 1000,18);
//		f.reajustarSalario();
//		f.imprimir();

		Programador p = new Programador("Jo�o", 8000, 22, "Java");
		// p.setDados("Jo�o", 8000,22,"Java");
		p.reajustarSalario();
		p.imprimir();

		Motorista m = new Motorista("Maria", 3000, 25, 400);
		// m.setDados("Maria", 3000,25,400);
		m.reajustarSalario();
		m.imprimir();

		Chefe c = new Chefe("Jos�", 20000, 35, "9999-4000");

		// c.setDados("Jos�", 20000,35, "9999-4000");
		c.reajustarSalario();
		c.imprimir();

	}
}

/*
 * ---------- Capture Output ---------- > "C:\Arquivos de
 * programas\Java\jdk1.6.0_10\bin\java.exe" Cadastro Nome: Pedro Idade: 18
 * Sal�rio: 1100.0 --------Dados do Programador ------------------------------
 * Nome: Jo�o Idade: 22 Sal�rio: 8300.0 Linguagem: Java --------Dados do
 * Motorista ------------------------------ Nome: Maria Idade: 25 Sal�rio:
 * 3200.0 Cnh: 400 --------Dados do Chefe ------------------------------ Nome:
 * Jos� Idade: 35 Sal�rio: 20100.0 Celular: 9999-4000 > Terminated with exit
 * code 0.
 */