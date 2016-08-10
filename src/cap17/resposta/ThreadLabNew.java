package cap17.lab;
public class ThreadLabNew extends Thread {

    public ThreadLabNew(String name) {
        super(name);
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            metodoAuxiliar();
        }
    }

    private synchronized void metodoAuxiliar() {
        System.out.println(Thread.currentThread().getName());

//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
