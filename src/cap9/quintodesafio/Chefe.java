package cap9.quintodesafio;

//import cap9.quintodesafio.geral.Endereco;
//import cap9.quintodesafio.geral.Funcionario;

import cap9.quintodesafio.geral.*;;

class Chefe extends Funcionario{
	String celular;
	
	Chefe (String nome,double salario,int idade, String celular, Endereco endereco){
	   	super(nome, salario,idade, endereco);
		this.celular=celular;
	  
	}
   
   String getCelular(){
       return celular;
   }
   
  public void reajustarSal(){
        salario += 100;
    }
   
//    public void reajustarSal(){
//         double reajuste = getSalario() +100;
//         this.setSalario(reajuste);
//    }
    
   public void imprimir(){
  
	   super.imprimir();
       System.out.println("Celular: " + getCelular());
       System.out.println("------------------------------------------------------");
   }
}