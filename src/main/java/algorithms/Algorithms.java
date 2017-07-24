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
            list.add((int) (Math.random() * 99));
        }

        System.out.println(list);

        Algorithms algs = new Algorithms();
        System.out.println("List sorted by Bubble Sort:");
        System.out.println(algs.bubbleSort(list));
        System.out.println("List sorted by Shaker Sort:");
        System.out.println(algs.shakerSort(list));
        System.out.println("List sorted by Insertion Sort:");
        System.out.println(algs.insertionSort(list));
        System.out.println("List sorted by Selection Sort:");
        System.out.println(algs.selectionSort(list));
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
            for (int j = 0; j < listCopy.size() - 1 - i; j++) {
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
     * Shaker sort.
     * Complexity: O(n^2).
     * Modification of bubble sort, a little bit faster.
     */
    public List<Integer> shakerSort(List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);

        int rightBound = listCopy.size() - 1;
        for (int leftBound = 0; leftBound < rightBound; ) {
            boolean isSorted = true;
            for (int i = leftBound; i < rightBound; i++) {
                if (listCopy.get(i) > listCopy.get(i + 1)) {
                    Collections.swap(listCopy, i, i + 1);
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }

            rightBound--;

            isSorted = true;
            for (int j = rightBound; j > leftBound; j--) {
                if (listCopy.get(j) < listCopy.get(j - 1)) {
                    Collections.swap(listCopy, j - 1, j);
                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }

            leftBound++;
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
     * Selection sort.
     * Complexity: O(n^2).
     * Can be both stable and unstable. Stable realization - we insert min element on the first unsorted position,
     * unstable - we swap min element with element on the first unsorted position.
     */
    public List<Integer> selectionSort(List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);

        for (int i = 0; i < listCopy.size(); i++) {
            int min = listCopy.get(i);
            int minIndex = i;

            for (int j = i + 1; j < listCopy.size(); j++) {
                if (min > listCopy.get(j)) {
                    min = listCopy.get(j);
                    minIndex = j;
                }
            }

            if (i != minIndex) {
                //Collections.swap(listCopy, i, minIndex);  // unstable realization

                listCopy.remove(minIndex);                  // stable realization
                listCopy.add(i, min);
            }
        }

        return listCopy;
    }

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
