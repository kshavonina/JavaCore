package studying_v2;

public class ExampleWithDefaultMethod implements InterfaceWithDefaultMethod {
    public static void main(String[] args) {
        ExampleWithDefaultMethod exampleClass = new ExampleWithDefaultMethod();
        exampleClass.method();
        exampleClass.printMethod("kakaka");

        System.out.println(InterfaceWithDefaultMethod.calc(3, 6));
        System.out.println(exampleClass.calc(3, 6));
    }

    public void method() {
        System.out.println("some text");
    }

    public void printMethod(String str) {
        System.out.println(" dwfwe we ");
    }

    public static int calc(int a, int b) {
        return a * b;
    }
}
