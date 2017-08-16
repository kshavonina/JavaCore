package studying_v2;

@FunctionalInterface
public interface FunInterface {
    void funMethod();

    default void firstMethod() {
        System.out.println("first");
    }

    default void secondMethod() {
        System.out.println("second");
    }

    static void staticMethod() {
        System.out.println("static");
    }

    static int calculate(double a) {
        return (int) a * 9;
    }
}
