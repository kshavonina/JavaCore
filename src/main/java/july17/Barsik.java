package july17;

public class Barsik implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.err.println(Thread.currentThread() + " eat " + i);
        }
        //System.err.print("...");
    }
}
