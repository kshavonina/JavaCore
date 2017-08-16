package studying_v2;

public abstract class Animal {
    int age;

    Animal(int age) {
        this.age = age;
    }

    public abstract void eat();
    public abstract void sleep();
}
