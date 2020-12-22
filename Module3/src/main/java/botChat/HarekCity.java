package main.java.botChat;

import java.util.*;


public class HarekCity {
    public String[] createEmptyNameArray() {
        String[] result = new String[0];
        return result;
    }

    public int[] createAgeArray(int age1, int age2, int age3, int age4) {
        return new int[]{age1, age2, age3, age4};
    }

    public void fixNames(String[] names, String[] toReplace) {
        names[1] = toReplace[0];
        names[3] = toReplace[1];
    }

    public String firstAndLastTogether(String[] names) {
        return names[0] + " AND " + names[9] + " TOGETHER";
    }

    public void changeElectResult(String[] results) {
        String temp = results[0];
        results[0] = results[results.length - 1];
        results[results.length - 1] = temp;
    }

    public String[] changeElectResultAgain(String[] results) {
        return new String[]{
                results[2],
                results[3],
                results[4]
        };
    }

    public char[][] createKeyboard() {
        return new char[][]  {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
    }

    public void printKeyboard() {
        char[][] arr = createKeyboard();

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println(Arrays.toString(arr[3]));
    }

    public String[] makeCopy(String[] names) {
        String[] copiedArr = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return copiedArr;
    }


    public static void main(String[] args) {
//-------------------------------------------------------------
// createEmptyNameArray() #5
//-------------------------------------------------------------
//      String[] arr = new HarekCity().createEmptyNameArray();
//      System.out.println(Arrays.toString(arr));
//-------------------------------------------------------------
// createAgeArray #6
//-------------------------------------------------------------
//      int[] ageArray = new HarekCity().createAgeArray(10, 20, 30, 40);
//      System.out.println(Arrays.toString(ageArray));
//-------------------------------------------------------------
// fixNames #7
//-------------------------------------------------------------
//       String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
//        String[] toReplace = new String[]{"lopr", "boki"};
//        new HarekCity().fixNames(names, toReplace);
//        System.out.println(Arrays.toString(names));
//-------------------------------------------------------------
// firstAndLastTogether #8
//-------------------------------------------------------------
//      String[] names = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
//        System.out.println(new HarekCity().firstAndLastTogether(names));
//-------------------------------------------------------------
// changeElectResult #9
//-------------------------------------------------------------
//      String[] results = new String[]{"miho", "hut"};
//        new HarekCity().changeElectResult(results);
//        System.out.println(Arrays.toString(results));
//-------------------------------------------------------------
// changeElectResultAgain #10
//-------------------------------------------------------------
//     String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
//        String[] changedResults = new HarekCity().changeElectResultAgain(results);
//        System.out.println(Arrays.toString(changedResults));
//-------------------------------------------------------------
// createKeyboard #11
//-------------------------------------------------------------
//        char[][] keyboard = new HarekCity().createKeyboard();
//        for (int i = 0; i < keyboard.length; i++) {
//            System.out.println(Arrays.toString(keyboard[i]));
//        }
//-------------------------------------------------------------
// printKeyboard #12
//-------------------------------------------------------------
//        new HarekCity().printKeyboard();
//-------------------------------------------------------------
// printKeyboard #13
//-------------------------------------------------------------
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = new HarekCity().makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));

    }
}
