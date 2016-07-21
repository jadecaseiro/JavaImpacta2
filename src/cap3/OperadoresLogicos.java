package cap3;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 1;
		int d = 20;
		System.out.println(b <a || c==1);
		// false or true =  true
		System.out.println(a ==d && d !=a);
		//true and false = false
		System.out.println(!(c>b));
		// not false = true
	}
}
