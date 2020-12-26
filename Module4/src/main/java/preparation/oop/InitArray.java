package main.java.preparation.oop;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class InitArray {

    public int[] init() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input size of array:");
        int arraySize = in.nextInt();
        in.close();

        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
        System.out.println("Array length : " + array.length);

        return array;
    }
}
