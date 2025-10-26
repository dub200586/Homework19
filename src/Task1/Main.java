package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите " + (i + 1) + "-e число");
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }else {
                System.out.println("Вы ввели не число");
                i--;
            }
            sc.nextLine();
        }

        MaxFinder maxFinder = new MaxFinder(arr);
        MinFinder minFinder = new MinFinder(arr);

        Thread maxValueTread = new Thread(maxFinder);
        Thread minValueTread = new Thread(minFinder);

        maxValueTread.start();
        minValueTread.start();
        minValueTread.join();
        maxValueTread.join();

        int max = maxFinder.getMaxValue();
        int min = minFinder.getMinValue();
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);
    }
}
