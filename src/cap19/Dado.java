package cap19;

public class Dado {
	
	Dado d;
	
	public static void main(String args[]){
		
		Dado d2 = new Dado();
		Dado d3 = new Dado();
		Dado d4 = new Dado();
		d2.d = d3;
		d3.d = d4;
		d4.d = d2;
		System.out.println("D2: " + d2);
		System.out.println("D3: " + d3);
		System.out.println("D4: " + d4);
		
		System.out.println();
		
		d2 = null;
		d3 = null;
		d4 = null;
		System.out.println("D2: " + d2);
		System.out.println("D3: " + d3);
		System.out.println("D4: " + d4);
	}
}
