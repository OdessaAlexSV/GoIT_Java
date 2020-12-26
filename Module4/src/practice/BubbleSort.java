package practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 8, 2, 3, 4, 10, 13, 17, 22};
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
    }
}

/* It works only for integer array
    int x = 10;
    int y = 23;

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
    output will be:
    x = 23
    y = 10
*/