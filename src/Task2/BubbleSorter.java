package Task2;

public class BubbleSorter implements Runnable {
    private int[] arr;

    public BubbleSorter(int[] arr) {
        this.arr = arr.clone();
    }

    public int[] getNewArr() {
        return arr;
    }

    @Override
    public void run() {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
