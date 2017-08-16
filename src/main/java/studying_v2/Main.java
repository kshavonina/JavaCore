package studying_v2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat(5);
        System.out.println(animal.age);


        Cat cat = new Cat(7);
        System.out.println(Cat.tailLength);
    }
}
