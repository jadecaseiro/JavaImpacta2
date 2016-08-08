package cap15;

import java.io.*;

public class EscreverArquivo {
	public static void main(String[] args) {

		File arquivo = new File(args[0]);
		try {
			// lê a entrada do fluxo
			InputStreamReader isr = new InputStreamReader(System.in);
			// guarda no buffer
			BufferedReader in = new BufferedReader(isr);
			// grava o arquivo
			PrintWriter out = new PrintWriter(new FileWriter(arquivo));
			String s;
			System.out.print("Entre com arquivo de texto: ");
			System.out.println("[CTRL Z]+[ENTER] para parar");

			while ((s = in.readLine()) != null) {
				out.println(s);
			}

			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
 * Executar no dos e escolher o diretorio de armazenamento:
 * 
 * java cap15.EscreverArquivo /texto.txt
 */