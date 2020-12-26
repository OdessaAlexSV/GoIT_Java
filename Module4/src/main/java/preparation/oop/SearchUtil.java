package main.java.preparation.oop;


public class SearchUtil {

    public int findElement(int[] array, int elementToSearch) {
        int lowIndex = 0;
        int highIndex = array.length - 1;

        return getMidElement(array, elementToSearch, lowIndex, highIndex);
    }

    private int getMidElement(int[] array, int elementToSearch, int lowIndex, int highIndex) {
        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            int midElement = array[midIndex];
            if (midElement > elementToSearch) {
                lowIndex = midIndex + 1;
            } else if (midElement < elementToSearch) {
                highIndex = midIndex - 1;
            } else
                return midElement;
        }
        return -1;
    }

}
