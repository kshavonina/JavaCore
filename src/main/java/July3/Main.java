package July3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BitSet set = new BitSet();
        List<Integer> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s = reader.readLine();
            while (!s.equals("8")) {
                list.add(Integer.parseInt(s));
                s = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(list.toString());

//        set.set(0, false);
//        set.set(1, true);
//        set.set(2, true);
//        set.set(3, false);

        for (int i = 0; i < list.size(); i++) {
            set.set(i, list.get(i) % 2 == 0); // odd - add, even - don't add
        }
    }
}
