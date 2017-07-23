package july10;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.count(2));

        int a = 2;
    }

    int count(int size) {
        try {
            System.out.println(size);
            throw new Exception();
        } catch (Exception e) {
            return size;
        } finally {
            ++size;
            System.out.println(size);
            //return size;
        }
    }
}
