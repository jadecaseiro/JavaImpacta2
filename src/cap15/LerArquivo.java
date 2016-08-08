package cap15;

import java.io.*;

class LerArquivo {
	public static void main(String[] args) {
		File arquivo = new File(args[0]);

		try {
			BufferedReader in = new BufferedReader(new FileReader(arquivo));
			String s;
			s = in.readLine();
			while (s != null) {
				System.out.println("Ler: " + s);
				s = in.readLine();
			}
			in.close();
		} catch (FileNotFoundException e1) {
			System.err.println("Arqivo não encontradao: " + arquivo);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}