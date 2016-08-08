package cap15;

import java.io.*;

public class ExemploLeitura {
	private static DataInputStream dados;

	public static void main(String[] args) {

		try {
			FileInputStream arquivo = new FileInputStream("GerarArquivo.txt");
			dados = new DataInputStream(arquivo);
			while (true) {
				char c = dados.readChar();
				System.out.println(c);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());

		}
	}
}