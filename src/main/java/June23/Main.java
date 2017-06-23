package June23;

import June22.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*// task 1: instanceof
        Cat murzik = new Murzik();

        System.out.println(murzik instanceof Murzik);
        System.out.println(murzik instanceof Barsik);*/

        /*// task2
        Date myDate = new Date();
        System.out.println("Before:" + myDate.getDate());
        changeDate(myDate);
        System.out.println("After:" + myDate.getDate());*/

        // task3
        Cat cat = new Cat();
        System.out.println(cat.hashCode());
        cat.setName("Barsik");
        System.out.println(cat.hashCode());

        Cat mur = new Murzik();
        System.out.println(mur.hashCode());
        System.out.println(cat.equals(mur));

        // task4
        Map<Cat, Cat> map = new HashMap<>();
        map.put(cat, cat);
    }

    public static void changeDate(Date date) {
        System.out.println("   - before change: " + date.getDate());
        date.setDate(12);
        System.out.println("   - after change: " + date.getDate());
    }
}
