package Task1;

public class MinFinder implements Runnable {
    private final int[] arr;
    private int minValue = Integer.MAX_VALUE;

    public MinFinder(int[] arr) {
        this.arr = arr;
    }

    public int getMinValue() {
        return minValue;
    }

    @Override
    public void run() {
        for (int j : arr) {
            if (j < minValue) {
                minValue = j;
            }
        }
    }
}
