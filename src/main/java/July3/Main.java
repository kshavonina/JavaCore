package July3;

import June22.Cat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*BitSet set = new BitSet();
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
            System.out.println("Index: " + i + " element: " + list.get(i) + " ");
        }

        for (int i = 0; i < list.size(); i++) {
            set.set(i, list.get(i) % 2 == 0); // odd - add, even - don't add
        }

        System.out.println("Is Even: ");
        System.out.println(set.toString());

        BitSet newSet = new BitSet();
        for (int i = 0; i < list.size(); i++) {
            newSet.and(set);
        }*/

        /*HashMap<String, String> map = new HashMap<>();
        map.put("Barsik", "BarsikEntry");

        System.out.println(map.values());*/

        HashMap<Cat, Cat> map = new HashMap<>();
        Cat barsik = new Cat("Barsik");
        Cat murzik = new Cat("Murzik");
        Cat dimok = new Cat("Dimok");
        Cat riska = new Cat("Riska");
        Cat snegok = new Cat("Snegok");
        Cat lev4ik = new Cat("Lev4ik");
        map.put(barsik, barsik);
        map.put(murzik, murzik);
        map.put(dimok, dimok);
        map.put(riska, riska);
        map.put(snegok, snegok);
        map.put(lev4ik, lev4ik);

        System.out.println(map);

        dimok.setName("dimok");

        System.out.println(map);


        map.put(dimok, dimok);

        System.out.println(map.containsKey(dimok));

        HashMap<Cat, Cat> newCatMap = new HashMap<>();
        newCatMap.putAll(map);

        System.out.println();
    }
}
