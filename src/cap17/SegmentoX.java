package cap17;

public class SegmentoX {
	public static void main(String[] args) {
		SegmentoY y = new SegmentoY();
		y.start();
		synchronized (y) {
			try {
				System.out.println("Esperando que Y seja executado......");
				y.wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("\nO montante de y é: " + y.montante);
	}
}
