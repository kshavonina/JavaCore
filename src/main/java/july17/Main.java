package july17;

public class Main {
    public static void main(String[] args) {
        System.err.println("Main thread: " + Thread.currentThread());
        Barsik barsik = new Barsik();
        Thread thread = new Thread(barsik);
        Thread thread1 = new Thread(barsik);
        Thread thread2 = new Thread(barsik);
        Murzik murzik = new Murzik();
        Thread thread3 = new Thread(murzik);
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();

        // another way to create new thread - anonymous class
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 300; i++) {
                    System.err.println(Thread.currentThread() + " eat" + i);
                }
            }
        }).start();
    }


}
