package cap6.lab1;

public class UsaFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setCargo("Programador");
		f1.setNome("João");
		f1.setSalario(10000);
		f1.setSobrenome("da Silva");
		
		f1.mostraDados();
		
	}

}
