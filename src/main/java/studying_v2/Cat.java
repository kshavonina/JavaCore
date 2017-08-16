package studying_v2;

public class Cat extends Animal {
    static final int tailLength = 45;

    public void eat() {
        System.out.println("eating");
    }

    Cat(int age) {
        super(age);
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
