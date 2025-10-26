package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[] {1, 5, 6, 9, 7, 3, 2, 8, 4, 0};

        BubbleSorter bubbleSorter = new BubbleSorter(arr);
        InsertionSorter insertionSorter = new InsertionSorter(arr);
        SelectionSorter selectionSorter = new SelectionSorter(arr);

        Thread bubbleSorterThread = new Thread(bubbleSorter);
        Thread insertionSorterThread = new Thread(insertionSorter);
        Thread selectionSorterThread = new Thread(selectionSorter);

        bubbleSorterThread.start();
        insertionSorterThread.start();
        selectionSorterThread.start();
        bubbleSorterThread.join();
        insertionSorterThread.join();
        selectionSorterThread.join();

        int[] bubbleSortedArr = bubbleSorter.getNewArr();
        int[] insertionSortedArr = insertionSorter.getNewArr();
        int[] selectionSortedArr = selectionSorter.getNewArr();

        System.out.println(Arrays.toString(bubbleSortedArr));
        System.out.println(Arrays.toString(insertionSortedArr));
        System.out.println(Arrays.toString(selectionSortedArr));
    }
}
