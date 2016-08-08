package cap15.lab;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap15Lab2 {
	static String PASTA_ORIGEM = "C:\\Users\\di3504\\workspace\\JavaImpacta\\documentos2";
	static String PASTA_DESTINO = "C:\\Users\\di3504\\workspace\\JavaImpacta\\documentos";

	public static void main(String[] args) {
		Path origem = Paths.get(PASTA_ORIGEM);
		Path backup = Paths.get(PASTA_DESTINO);

		try {
			if (!Files.exists(backup)) {
				Files.createDirectories(backup);
			
			}else {Files.delete(backup);Files.createDirectories(backup);}
			
			Stream<Path> streamOrigem = Files.list(origem);
			streamOrigem.forEach(p -> {
				try {
					Files.copy(p, backup.resolve(p.getFileName()));
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			});
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
