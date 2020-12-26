package main.java.preparation.oop;

public class PrintArray {

    public int[] print(int[] array) {
        int counter = 1;
        System.out.println("Initial array:");
        for (int element : array) {
            System.out.print(element + "\t");
            if (counter++ % 10 == 0) {
                System.out.println("\n");
            }
        }
        return array;
    }
}
