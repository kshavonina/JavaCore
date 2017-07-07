package July7;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.util.Calendar.*;

public class Main {
    public static void main(String[] args) {
        /*String name = "ЙожикЫЫ";
        String.format(name, Locale.CHINESE);
        System.out.println(name);*/

        /*StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter(sb, Locale.US);

        // Explicit argument indices may be used to re-order output.
        formatter.format("%4$2s %3$2s %2$2s %1$2s", "a", "b", "c", "d");
        // -> " d  c  b  a"

        // Optional locale as the first argument can be used to get
        // locale-specific formatting of numbers.  The precision and width can be
        // given to round and align the value.
        formatter.format(Locale.FRANCE, "e = %+10.4f", Math.E);*/

        /*Main main = new Main();
        main.formatStr(200, 11, 1);*/

        /*String name = "KJaaaa*rl.aaj";
        String res1 = name.replace("a*", "");
        System.out.println(res1);
//        String res2 = name.replaceFirst("a", "");
//        System.out.println(res2);
        String res3 = name.replaceAll("a*", "");
        System.out.println(res3);*/

        String name = "asdd2";

        StringBuilder builder = new StringBuilder();
        builder.append("asdd").append(2);

        System.out.println(name.contentEquals(builder));
        System.out.println(name.contentEquals(builder.toString()));

        name.intern();

        String name1 = "j";
        name1.intern();
        String name2 = "j";
        name2.intern();

        System.out.println(name1 == name2);
    }

    void formatStr(int year, int month, int day) {
        Calendar c = new GregorianCalendar(1995, MAY, 23);
        String s = String.format("Duke's Birthday: %1$tm %1$te, %1$tY", c);
        Calendar newC = new GregorianCalendar(2000, JUNE, 22);
        System.out.println(s);
        System.out.println(String.format("Duke's Birthday: %1$tm %1$te, %1$tY", newC));
    }
}
