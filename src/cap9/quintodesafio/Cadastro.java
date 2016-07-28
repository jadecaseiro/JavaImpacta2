package cap9.quintodesafio;

import cap9.quintodesafio.geral.Endereco;

public class Cadastro {
   public static void main(String args[]){

       Endereco endereco = new Endereco();
       
       Chefe c = new Chefe("José", 20000,35, "9999-4000",endereco);
       c.endereco.setEndereco("Av. Brasil", 2009, "Jardins");
       c.reajustarSal();
       c.imprimir();
       
	   	
	   Programador p = new Programador("João", 22, 8000, "Java","Av. Rebouças", 350, "Pinheiros");
//	   p.salario = 20000; //acesso negado, atributo protegido
	   p.endereco.setEndereco("Av. Rebouças", 350, "Pinheiros");
	   p.reajustarSal();
	   p.imprimir();
	
	   Motorista m = new Motorista("Maria", 28, 3000, 400, endereco);
	   m.endereco.setEndereco("Rua Boa Vista", 148, "Centro");
	   m.reajustarSal();
	   m.imprimir();
   }
}