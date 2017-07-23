package algorithms;

import sun.java2d.windows.GDIRenderer;

import java.util.*;

public class Algorithms {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int listLength = (int) (Math.random() * 30 + 20);
        System.out.println(listLength);

        for (int i = 0; i < listLength; i++) {
            list.add((int) (Math.random() * 99));
        }

        System.out.println(list);

        Algorithms algs = new Algorithms();
        System.out.println("List sorted by Bubble Sort:");
        System.out.println(algs.bubbleSort(list));
        System.out.println("List sorted by Insertion Sort:");
        System.out.println(algs.insertionSort(list));
    }

    /**
     * Bubble sort.
     * Complexity: O(n^2).
     * Effective only for small arrays. Used for educational purposes.
     */
    public List<Integer> bubbleSort(List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);

        for (int i = 0; i < listCopy.size() - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < listCopy.size() - i - 1; j++) {
                if (listCopy.get(j) > listCopy.get(j + 1)) {
                    Collections.swap(listCopy, j, j + 1);
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }

        return listCopy;
    }

    /**
     * Insertion sort.
     * Complexity: O(n^2).
     * Better use for small arrays (number of elements < 100).
     */
    public List<Integer> insertionSort(List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);

        for (int i = 1; i < listCopy.size(); i++) {
            int j = i;

            while (j > 0 && listCopy.get(j - 1) > listCopy.get(j)) {
                Collections.swap(listCopy, j, j - 1);
                j--;
            }
        }

        return listCopy;
    }

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
