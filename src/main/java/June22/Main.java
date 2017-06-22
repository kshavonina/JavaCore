import javafx.scene.SubScene;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    boolean a, b;
    boolean c = true, d = true;
    boolean e;

    public static void main(String[] args) {
        /*// task1
        Main main = new Main();
        *//*System.out.println(main.a);
        System.out.println(main.b);*//*
        System.out.println(main.isTrueA(main.a, main.b));
        System.out.println(main.isTrueB(main.b, main.c));
        System.out.println(main.isTrueC(main.a, main.b, main.c));
        System.out.println(main.isTrueD(main.b, main.c, main.e));
        System.out.println(main.isTrueE(main.a, main.c, main.e));

        // task2
        // каждый раз тут с новой строки multiply - чтобы можно было кинуть breakpoint когда будем дебажить
        // (это общеприменимый подход)
        BigInteger numI1, numI2*//*, bigNumI*//*;
        numI1 = BigInteger.valueOf(1_000_000_000_000L);

        numI2 = numI1.multiply(numI1);
        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);

        numI2 = numI1.multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1)
                .multiply(numI1);
        System.out.println(numI2);

        // task3
        // про кэширование (аналогично с Long, а с Byte получается все значения при сравнении дадут true, т.к.
        // у Byte 127 - максимальное значение)
        Integer i = Integer.valueOf(127);
        Integer j = Integer.valueOf(127);
        System.out.println(i == j);

        Integer a = Integer.valueOf(129);
        Integer b = Integer.valueOf(129);
        System.out.println(a == b);*/

        /*// task4
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Main main2 = new Main();
            System.out.println(main2.isEven(Integer.parseInt(reader.readLine())));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        // task5: operations priority
        int i = 3;
        i = -i++ + i++ + -i;
        System.out.println(i);
        System.out.println(Double.MAX_VALUE);

    }

    private String isEven(int count) {
        return count % 2 == 0 ? "even" : "odd";
    }

    public boolean isTrueA(boolean a, boolean b) {
        return !a && b;
    }

    public boolean isTrueB(boolean b, boolean c) {
        return b || c;
    }

    public boolean isTrueC(boolean a, boolean b, boolean c) {
        return a && b != c;
    }

    public boolean isTrueD(boolean b, boolean c, boolean e) {
        return b || c || e;
    }

    public boolean isTrueE(boolean a, boolean c, boolean e) {
        return a || c && e;
    }
}
