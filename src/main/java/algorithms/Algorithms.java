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
        /*System.out.println("List sorted by Merge Sort:");
        System.out.println(algs.mergeSort(list));*/


        List<Integer> firstList = new ArrayList<>();
        firstList.add(1);
        firstList.add(6);
        firstList.add(7);
        firstList.add(7);
        firstList.add(8);
        List<Integer> secondList = new ArrayList<>();
        secondList.add(2);
        secondList.add(3);
        secondList.add(3);
        secondList.add(7);
        secondList.add(9);
        System.out.println(algs.merge(firstList, secondList));

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
    public List<Integer> mergeSort(List<Integer> list) {
        Algorithms algorithms = new Algorithms();
        List<Integer> listCopy = algorithms.innerMergeSort(list);

        return listCopy;
    }

    private List<Integer> innerMergeSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        int middle = list.size() / 2;

        Algorithms algorithms = new Algorithms();

        return merge(algorithms.mergeSort(list.subList(0, middle)),
                algorithms.mergeSort(list.subList(middle, list.size())));
    }

    private List<Integer> merge(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();

        if (firstList.size() == 1 && secondList.size() == 1) {
            resultList.add(Math.min(firstList.get(0), secondList.get(0)));
            resultList.add(Math.max(firstList.get(0), secondList.get(0)));
            return resultList;
        }

        int firstIndex = 0;
        int secondIndex = 0;

        int buffer;

        boolean isFirstListUsed = true;
        if (firstList.get(firstIndex) < secondList.get(secondIndex)) {
            resultList.add(firstList.get(firstIndex));
            firstIndex++;
            buffer = secondList.get(secondIndex);
        } else {
            resultList.add(secondList.get(secondIndex));
            secondIndex++;
            buffer = firstList.get(firstIndex);
            isFirstListUsed = false;
        }

        while (firstIndex < firstList.size() && secondIndex < secondList.size()) {
            if (firstList.get(firstIndex) < buffer) {
                buffer = firstList.get(firstIndex);
                //firstIndex++;
            }

            if (secondList.get(secondIndex) < buffer) {
                buffer = secondList.get(secondIndex);
                isFirstListUsed = false;
                //secondIndex++;
                //firstIndex--;
            }

            resultList.add(buffer);
            if (isFirstListUsed) {
                buffer = secondList.get(secondIndex);
                firstIndex++;
            } else {
                buffer = firstList.get(firstIndex);
                secondIndex++;
            }
        }

        if (firstIndex == firstList.size()) {
            for (int i = secondIndex; i < secondList.size(); i++) {
                resultList.add(secondList.get(i));
            }
        }

        if (secondIndex == secondList.size()) {
            for (int i = firstIndex; i < firstList.size(); i++) {
                resultList.add(firstList.get(i));
            }
        }

        return resultList;
    }

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
