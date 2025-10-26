package Task2;

public class InsertionSorter implements Runnable {
    private int[] arr;

    public InsertionSorter(int[] arr) {
        this.arr = arr.clone();
    }

    public int[] getNewArr() {
        return arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
