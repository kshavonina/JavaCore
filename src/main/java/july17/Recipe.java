package july17;

import java.io.IOException;

public class Recipe {
    // кастрюля с кешем
    // if we do it volatile, we have no problems
    public volatile static boolean flag = true;

    public static void main(String[] args) {
        new Recipe.ThreadFlagSetter().start();
        new Recipe.ThreadFlagReader().start();
    }

    public static class ThreadFlagSetter extends Thread {
        @Override
        public void run() {
            try {
                int k = System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }

            flag = false; // кеш кастрюли
            System.err.println("Flag now is false");
        }
    }

    public static class ThreadFlagReader extends Thread {
        @Override
        public void run() {
            System.err.println("waiting...");
            while (flag) {
                //System.err.println("waiting...");
            }

            System.err.println("Go go");
        }
    }
}
