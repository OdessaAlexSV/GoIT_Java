package main.java.preparation.oop;

public class OOPStyleTraining {
    public static void main(String[] args) {
        InitArray newArray = new InitArray();
        int[] createdArray = newArray.init();

        PrintArray printArray = new PrintArray();
        printArray.print(createdArray);

        SortUtil sort = new SortUtil();
        sort.sortAsc(createdArray);

        SearchUtil search = new SearchUtil();
        int foundElement = search.findElement(createdArray, 98);
        System.out.println("\n"+foundElement);

    }
}
