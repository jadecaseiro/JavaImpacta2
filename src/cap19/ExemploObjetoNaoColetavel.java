package cap19;
import java.util.Date;

public class ExemploObjetoNaoColetavel {
	public static void main(String args[]){
		
		Date data = getDate();
		System.out.println("data = " + data);
	}
	
	public static Date getDate(){
		
		Date data2 = new Date();
		StringBuffer agora = new StringBuffer(data2.toString());
		System.out.println("agora = " + agora);
		return data2;
	}
}
