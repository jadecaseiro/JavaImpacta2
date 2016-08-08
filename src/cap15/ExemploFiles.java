package cap15;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploFiles {
public static void main(String[] args) {
	
	try{
	Path arquivo = Paths.get("somNaCaixa\\poema.txt");
	Path novaPasta = Paths.get("somNaCaixa\\textos\\rascunhos\\vazio");
	Path pasta = Paths.get("somNaCaixa");
	
	 	if(!Files.exists(arquivo)){
	 		System.out.println("Arquivo não existe");
	 	}else if(Files.isDirectory(arquivo)){
	 		System.out.println("É diretorio");
	 	}else if(Files.isRegularFile(arquivo)){
	 		System.out.println("O item é um arquivo.");
	 	}
	 	System.out.println(Files.size(arquivo));
	 	
	 	Files.createDirectories(novaPasta);
	 	
	 	Files.list(pasta).forEach(f -> System.out.println(f.getFileName()));
}catch(IOException e){
	System.out.println(e);
	}
}
}
