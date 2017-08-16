package studying;

/**
 * Example with nested class.
 *
 * @author Kseniya Shavonina
 * @version 1.0
 */
public class OuterClass {
    private static String outerStaticField = "Outer static field";
    String outerField = "Non static outer field";

    public static void main(String[] args) {
        /*// static context
        System.out.println(NestedClass.staticField);
        NestedClass.staticPrint();

        // non-static context
        NestedClass nestedClass = new NestedClass();
        System.out.println(nestedClass.field);

        nestedClass.print();*/

        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();

        innerClass.innerPrint();
    }

    private static void outerStaticPrint() {
        System.out.println("Outer static print");
    }

    private void outerPrint() {
        InnerClass innerClass = new InnerClass();
        System.out.println("Non static outer print");
    }

    static class NestedClass {
        private static String staticField = "Static field";
        String field = "Non static field";

        public static void main(String[] args) {
            // non-static context
            OuterClass outerClass = new OuterClass();
            System.out.println(outerClass.outerField);

            outerClass.outerPrint();
        }

        private static void staticPrint() {
            // static context
            outerStaticPrint();
            System.out.println(outerStaticField);
            System.out.println("Static print");
        }

        void print() {
            System.out.println("Non static print");
        }
    }

    class InnerClass {
        String innerStaticField = "Inner static field";

        void innerPrint() {
            OuterClass.this.outerPrint();
            System.out.println("Inner print");
        }
    }

    InnerClass getInnerClass() {
        return new InnerClass();
    }
}
