package cap9.segundodesafio;

/*Baseando-se nos arquivos do pacote 
 cap9.primeirodesafio, fa�a:

 1) Altere as classes Funcionario, Programador, Chefe
 e Motorista para que a classe Cadastro funcione
 exatamente como esta.

 

 Obs.: N�O ALTERE NADA NA CLASSE CADASTRO!
 */

class Cadastro {
	public static void main(String args[]) {
		Funcionario f = new Funcionario();
		f.setDados("Pedro", 1000, 18);
		f.reajustarSalario();
		f.imprimir();
		

		Programador p = new Programador();
		p.setDados("Jo�o", 8000, 22, "Java");
		p.reajustarSalario();
		p.imprimir();

		Motorista m = new Motorista();
		m.setDados("Maria", 3000, 25, 400);
		m.reajustarSalario();
		m.imprimir();

		Chefe c = new Chefe();
		c.setDados("Jos�", 20000, 35, "9999-4000");
		c.reajustarSalario();
		c.imprimir();

	}
}

/*
 * Nome: Pedro Idade: 18 Sal�rio: 1100.0
 * --------Dados do Programador------------------------------ 
 *  Nome: Jo�o Idade: 22 Sal�rio: 8300.0 Linguagem: Java 
 * --------Dados do Motorista ------------------------------
 * Nome: Maria Idade: 25 Sal�rio: 3200.0 Cnh: 400 
 * --------Dados do Chefe ------------------------------ 
 * Nome: Jos� Idade: 35 Sal�rio: 20100.0 Celular:9999-4000
 * 
 * 
 * 
 */
