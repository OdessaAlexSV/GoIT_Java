package main.java.preparation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ProceduralStyle {

    private static int[] array;
    private static int result;
    private static int counter;

    public static void main(String[] args) {
        init();

        System.out.println("Initial array:");
        print(array);

        System.out.println("\n\nArray length : " + array.length);
        result = linerSearch(array, 98);
        System.out.println("\nLinearSearch");
        System.out.println("-".repeat(8));
        System.out.println(result);
        System.out.println(counter);

        Arrays.sort(array);
        result = binarySearch(array, 98);
        System.out.println("\nBinarySearch");
        System.out.println("-".repeat(8));
        System.out.println(result);
        System.out.println(counter);
    }

    private static int linerSearch(int[] array, int elementToSearch) {
        counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
            if (array[i] == elementToSearch) {
                return array[i];
            }
        }
        return -1;
    }

    private static int binarySearch(int[] array, int elementToSearch) {
        counter = 0;

        int lowIndex = 0;
        int highIndex = array.length - 1;

        while (lowIndex <= highIndex) {
            counter++;
            int midIndex = (lowIndex + highIndex) / 2;
            int midElement = array[midIndex];
            if (midElement < elementToSearch) {
                lowIndex = midIndex + 1;
            } else if (midElement > elementToSearch) {
                highIndex = midIndex - 1;
            } else
                return midElement;
        }

        return -1;
    }

    private static void init() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array:");
        array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
        in.close();
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + "\t");
        }
    }
}


