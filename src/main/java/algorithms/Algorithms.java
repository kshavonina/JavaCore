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
        System.out.println("List sorted by Merge Sort:");
        System.out.println(algs.mergeSort(list));
        System.out.println("List sorted by Quick Sort:");
        System.out.println(algs.quickSort(list));
        System.out.println("List sorted by Radix Sort LSD:");
        System.out.println(algs.radixSortLSD(list));
        System.out.println("List sorted by Radix Sort MSD:");
        System.out.println();

        System.out.println();
        System.out.println("Index of element " + 98 + " is: " + algs.binarySearch(algs.quickSort(list), 98));
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
     * Merge sort.
     * Complexity: O(n*log(n))
     * Sortable list divides into two parts of approximately the same size. Each of the parts sorts separately by
     * recursive call. And then two sorted list's parts merge into one list.
     */
    public List<Integer> mergeSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        int middle = list.size() / 2;

        Algorithms algorithms = new Algorithms();

        return merge(algorithms.mergeSort(list.subList(0, middle)),
                algorithms.mergeSort(list.subList(middle, list.size())));
    }

    // Merges two parts of sorted list in one list.
    private List<Integer> merge(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();

        if (firstList.size() == 1 && secondList.size() == 1) {
            resultList.add(Math.min(firstList.get(0), secondList.get(0)));
            resultList.add(Math.max(firstList.get(0), secondList.get(0)));
            return resultList;
        }

        int firstIndex = 0;
        int secondIndex = 0;

        while (firstIndex < firstList.size() && secondIndex < secondList.size()) {
            if (firstList.get(firstIndex) < secondList.get(secondIndex)) {
                resultList.add(firstList.get(firstIndex));
                firstIndex++;
            } else {
                resultList.add(secondList.get(secondIndex));
                secondIndex++;
            }
        }

        if (firstIndex < firstList.size()) {
            for (int i = firstIndex; i < firstList.size(); i++) {
                resultList.add(firstList.get(i));
            }
        }

        if (secondIndex < secondList.size()) {
            for (int i = secondIndex; i < secondList.size(); i++) {
                resultList.add(secondList.get(i));
            }
        }

        return resultList;
    }

    /**
     * Quick sort.
     * Complexity: O(n log(n)). (average; the worst: O(n^2))
     * One of the fastest sortings. Select the pivot, do partition, and then repeat it for subarrays
     * left and right of the pivot.
     */
    public List<Integer> quickSort(List<Integer> list) {
        List<Integer> listCopy = new ArrayList<>(list);
        new Algorithms().qsort(listCopy);
        return listCopy;
    }

    private void qsort(List<Integer> list) {
        if (list.size() > 1) {
            Algorithms algorithms = new Algorithms();
            int p = algorithms.partition(list);
            algorithms.qsort(list.subList(0, p > 0 ? p : 0));
            algorithms.qsort(list.subList(p < list.size() - 1 ? p + 1 : list.size() - 1, list.size()));
            /*subList(int fromIndex, int toIndex) Returns a view of the portion of this list between
             the specified fromIndex, INCLUSIVE, and toIndex, EXCLUSIVE.*/
        }
    }

    private int partition(List<Integer> list) {
        int pivotIndex = (int) (Math.random() * (list.size() - 1));
        Integer pivot = list.get(pivotIndex);
        Collections.swap(list, 0, pivotIndex);
        pivotIndex = 0;

        for (int i = 1; i < list.size(); i++) {
            if (pivot >= list.get(i)) {
                int lessThanPivot = list.get(i);
                list.remove(i);
                list.add(pivotIndex, lessThanPivot);
                if (pivot != lessThanPivot) {
                    pivotIndex++;
                }
            }
        }

        return pivotIndex;
    }

    /**
     * Radix sort.
     * Complexity: O(m(n + k)).
     * n - number of elements,
     * m - bit number of max value in sorting list,
     * k - bit number of data (number of possible key bit values; for example, with russian words k = 33,
     * since the letter can take no more than 33 values).
     * LSD - Least Significant Digit. In this implementation of the algorithm, we begin with the lowest digit.
     */
    public List<Integer> radixSortLSD(List<Integer> list) {
        List<Integer> tempList = new ArrayList<>(list);
        List<Integer> resultList = new ArrayList<>(list);

        int maxValue = list.get(0);
        for (int value : list) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        int exp = 1;

        while (maxValue / exp > 0) {
            int[] bucket = new int[10];

            for (int i = 0; i < resultList.size(); i++) {
                bucket[resultList.get(i) / exp % 10]++;
            }

            for (int i = 1; i < bucket.length; i++) {
                bucket[i] += bucket[i - 1];
            }

            for (int i = tempList.size() - 1; i >= 0; i--) {
                bucket[resultList.get(i) / exp % 10]--;
                tempList.set(bucket[resultList.get(i) / exp % 10], resultList.get(i));
            }

            for (int i = 0; i < resultList.size(); i++) {
                resultList.set(i, tempList.get(i));
            }

            exp *= 10;
        }

        return resultList;
    }

    /**
     * Binary search.
     * Complexity: O(log(n)).
     * Also known as half-interval search, logarithmic search, or binary chop.
     * Classic search algorithm that finds the position of a target value within a sorted array.
     * Runs in at worst logarithmic time, making O(log n) comparisons
     */
    public int binarySearch(List<Integer> list, int value) {
        int fromIndex = 0;
        int toIndex = list.size() - 1;

        while (fromIndex <= toIndex) {
            int middleIndex = fromIndex + (toIndex - fromIndex) / 2;

            if (list.get(middleIndex) == value) {
                return middleIndex;
            } else if (list.get(middleIndex) > value) {
                toIndex = middleIndex - 1;
            } else {
                fromIndex = middleIndex + 1;
            }
        }

        return -1;
    }
}
