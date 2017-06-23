package June23;

import June22.*;

public class Main {
    public static void main(String[] args) {
        // task 1: instanceof
        Cat murzik = new Murzik();

        System.out.println(murzik instanceof Murzik);
        System.out.println(murzik instanceof Barsik);
    }
}
