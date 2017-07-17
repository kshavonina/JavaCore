package July17;

public class ATM {
    private static int cash = 500;

    public static void main(String[] args) {
        System.err.println("Our balance: " + cash);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Barsik ");
                getMoney(250);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Barsik ");
                getMoney(250);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Murzik ");
                getMoney(250);
            }
        }).start();
    }

    private synchronized static void getMoney(int amount) {
        if (amount <= cash) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cash -= amount;

            System.err.println("Done. New amount: " + cash);
        } else {
            System.err.println("Not enough money.");
        }
    }
}
