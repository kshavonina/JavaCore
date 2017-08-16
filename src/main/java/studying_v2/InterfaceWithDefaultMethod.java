package studying_v2;

public interface InterfaceWithDefaultMethod {
    void method();

    default void printMethod(String str) {
        System.out.println(str);
    }

    static int calc(int a, int b) {
        return a + b;
    }

}
