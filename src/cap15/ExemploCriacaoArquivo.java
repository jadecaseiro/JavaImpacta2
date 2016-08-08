package cap15;

import java.io.*;

public class ExemploCriacaoArquivo {
	private static DataOutputStream dados;

	//static String texto = "Java";
	public static void main(String[] args) {
		
		try{
		FileOutputStream arquivo = new FileOutputStream("GerarArquivo.txt");
		dados = new DataOutputStream(arquivo);
		dados.writeChars("JAVA");
		}catch(IOException e){
			System.out.println(e.getMessage());
		}
	}

}
