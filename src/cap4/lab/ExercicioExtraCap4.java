package cap4.lab;

public class ExercicioExtraCap4 {
	public static void main(String[] args) {
		double faixaSalarial = 4000;
		double impostoDeRenda;
		if (faixaSalarial <= 1903.98) {
			impostoDeRenda = 0;
		} else if (faixaSalarial <= 2826.65) {
			impostoDeRenda = 0.075 * faixaSalarial - 142.80;
		} else if (faixaSalarial <= 3751.05) {
			impostoDeRenda = 0.15 * faixaSalarial - 354.80;
		} else if (faixaSalarial <= 4664.68) {
			impostoDeRenda = 0.22 * faixaSalarial - 636.13;
		} else {
			impostoDeRenda = 0.275 * faixaSalarial - 869.36;
		}
		System.out.println("O imposto de renda é de " + impostoDeRenda);
	}
}
/*
 * Baseando-se na tabela a seguir, desenvolver um código que retorne o valor do
 * imposto de renda de um salário de R$ 4.000,00.
 * 
 * Faixa salarial.................Alíquota................Parcela a deduzir
 * 
 * Até 1.903,98 	             - 			- 
 * De 1.903,99 até 2.826,65........ 7,5% ..................142.80
 * De 2.826,66 até 3751.05........  15% ..................354.80 
 * De 3751.06 até 4664.68........  22% ..................636.13 
 * Acima de 4.664,68 .................27,5% ..................869.36
 */