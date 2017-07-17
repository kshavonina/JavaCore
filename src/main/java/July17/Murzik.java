package July17;

public class Murzik extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.err.println(Thread.currentThread() + " eat" + i);
        }
    }
}
