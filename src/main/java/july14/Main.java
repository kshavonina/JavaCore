package july14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        /*// Java SE 6 style
        PrintWriter pw = null;

        try {
            // создание потокового объекта (открытие потока)
            FileWriter out = new FileWriter("text.txt");

            // придание потоковому объекту требуемых свойств
            BufferedWriter br = new BufferedWriter(out);
            pw = new PrintWriter(br);

            // работа с потоком через потоковый объект
            pw.println("I'm a sentence in a text-file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (pw != null) {
                pw.close(); // закрытие потока
            }
        }*/

        // Java SE 7 + style: try-with-resources
        try (PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("text2.txt")))) {
            // работа с потоком через потоковый объект
            pw.println("I'm a sentence in text file 2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
