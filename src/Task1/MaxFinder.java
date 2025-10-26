package Task1;

public class MaxFinder implements Runnable {
    private final int[] arr;
    private int maxValue;

    public MaxFinder(int[] arr) {
        this.arr = arr;
    }

    public int getMaxValue() {
        return maxValue;
    }

    @Override
    public void run() {
        for (int j : arr) {
            if (j > maxValue) {
                maxValue = j;
            }
        }
    }
}
