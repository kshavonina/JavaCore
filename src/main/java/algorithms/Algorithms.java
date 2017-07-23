package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int listLength = (int) (Math.random() * 30 + 20);
        System.out.println(listLength);

        for (int i = 0; i < listLength; i++) {
            list.add((int) (Math.random() * 200));
        }

        System.out.println(list);

        Algorithms algs = new Algorithms();
        System.out.println("List sorted by Bubble Sort:");
        System.out.println(algs.bubbleSort(list));

        System.out.println(list);


    }

    /**
     * Bubble sort.
     * Complexity: O(n^2).
     * Effective only for small arrays. Used for educational purposes.
     */
    public List<Integer> bubbleSort(List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);

        for (int i = 0; i < listCopy.size() - 1; i++) {
            for (int j = 0; j < listCopy.size() - i - 1; j++) {
                if (listCopy.get(j) > listCopy.get(j + 1)) {
                    Collections.swap(listCopy, j, j + 1);
                }
            }
        }

        return listCopy;
    }

    /**
     * Insertion sort
     */

    /**
     * Selection sort
     */

    /**
     * Merge sort
     */

    /**
     * Quick sort
     */

    /**
     * Radix sort
     */

    /**
     * Binary search
     */
}
