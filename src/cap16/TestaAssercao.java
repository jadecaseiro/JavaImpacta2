/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cap16;

import java.util.Scanner;

public class TestaAssercao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número entre 0 e 10: ");
		int num = input.nextInt();
		// afirma que o valor absoluto é >=0
		assert (num >= 0 && num <= 10) : "numero errado: " + num;
		System.out.println("Você digitou: " + num);
	}
}

/*
 * java -ea cap16.TestaAssercao
 */
