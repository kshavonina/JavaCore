package July13;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.sum(2, 2));
        System.out.println(main.getJackName("Tom"));
    }

    public int sum(int x, int y) {
        return x + y;
    }

    public String getJackName(String name) {
        return name;
    }
}
