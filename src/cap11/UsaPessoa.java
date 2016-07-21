package cap11;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[2]; //Cria o array q vai guardar objetos Pessoa

		pessoas[0] = new Pessoa(); // cria o objeto q ficará na posição 0 do array
		pessoas[1] = new Pessoa();

		pessoas[0].setAltura(1.68); //atribui valores
		pessoas[0].setNome("Maria");
		pessoas[0].setPeso(55);

		pessoas[1].setAltura(1.90);
		pessoas[1].setNome("João");
		pessoas[1].setPeso(85);
		
		pessoas[0].mostrarDados(pessoas);
	
	}

}
