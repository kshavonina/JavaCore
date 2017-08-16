package studying;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        //shape.draw();
        System.out.println(shape.name);

        Triangle triangle = new Triangle();
        //triangle.draw();
        System.out.println(triangle.name);

        Shape figure = new Triangle();
        //figure.draw();
        System.out.println(((Triangle) figure).name);

        OuterClass.NestedClass newClass = new OuterClass.NestedClass();

        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass newInner = outerClass.new InnerClass();
        newInner.innerPrint();

        OuterClass.InnerClass innerClass = outerClass.getInnerClass();
        innerClass.innerPrint();
        System.out.println(innerClass.innerStaticField);
    }

    int count(int a) {
        return a;
    }

    static void count(int a, int b) {
        System.out.println(a + b);
    }
}
