package cap19;
import java.util.Date;

public class ExibicaoInfoMemoria {
	public static void main(String args[]){
		
		Runtime status = Runtime.getRuntime();
		System.out.println("Total de mem�ria no JVM = " + status.totalMemory());
		System.out.println("Mem�ria anterior = " + status.freeMemory());
		Date data = null;
		for(int i = 0; i < 500000; i++){
			data = new Date();
			data = null;
		}
		System.out.println("Mem�ria posterior = " + status.freeMemory());
		status.gc(); // Uma alternativa ao System.gc()
		System.out.println("Mem�ria ap�s o m�todo gc = " + status.freeMemory());
	}
}
