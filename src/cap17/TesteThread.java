
package cap17;

public class TesteThread {
	public static void main(String[] args) {
		Xyz r = new Xyz();
		Thread t1 = new Thread(r, "T1");
		Thread t2 = new Thread(r, "T2");

		t2.start();

		try {
			t2.join(10000);
		} catch (Exception e) {
		}

		t1.start();
	}
}

class Xyz implements Runnable {
	int i;

	public void run() {
		i = 0;
		while (true) {
			System.out.println(Thread.currentThread().getName() + " " + i++);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

			if (i == 10)
				break;
		}
	}

}