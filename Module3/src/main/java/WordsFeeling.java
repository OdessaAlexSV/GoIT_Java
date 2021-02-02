package main.java;

/**
 * Дан массив с перечнем чувств (выше)
 * Пользователь вводит строку, которая состоит за набора букв.
 * Необходимо вывести на экран количество слов из массива, которые можно собрать при помощи букв из введенной строки.
 * Каждую букву в строке можно задействовать только один раз для одного слова, но можно переиспользовать для другого слова
 * (например, одна буква е может быть использована для составления 4 слов из массива)
 */

import java.util.Arrays;
import java.util.Scanner;

public class WordsFeeling {

    public static void main(String[] args) {

        String[] arr = {"anger", "awe", "joy", "love", "grief"};

        Scanner in = new Scanner(System.in);
        System.out.println("Input any sequence of letters: ");
        String phrase = in.nextLine();

        int count = arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length()-1; j++) {
                if (!(phrase.toLowerCase().contains(Character.toString(arr[i].charAt(j))))) {
                    j = (arr[i].length());
                    count--;
                    arr[i]="";
                }
            }
        }
        System.out.println("\"" + phrase + "\"  ==> " + count + " feelings");
        for (String item : arr ){
            if (!item.isEmpty())
            System.out.print(item+" ");
        }
        System.out.println("\n"+Arrays.toString(arr));
    }
}