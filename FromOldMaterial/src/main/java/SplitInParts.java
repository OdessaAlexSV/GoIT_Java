package main.java;

/**
 * Напишите метод, который разделит строку на строки одинаковой длины и соберет обратно через пробел
 * (либо просто вставит пробел через каждые N символов):
 */

public class SplitInParts {
    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 4));
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 5));
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 6));
        System.out.println();
        System.out.println(joinToAll(splitInParts("supercalifragilisticexpialidocious", 3)));
        System.out.println(joinToAll(splitInParts("supercalifragilisticexpialidocious", 4)));
        System.out.println(joinToAll(splitInParts("supercalifragilisticexpialidocious", 5)));
        System.out.println(joinToAll(splitInParts("supercalifragilisticexpialidocious", 6)));
    }

    public static String splitInParts(String phrase, int partLength) {
        StringBuilder str = new StringBuilder();
        char[] arr = phrase.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            str = str.append(arr[i]);
            if ((i + 1) % partLength == 0) {
                str = str.append(" ");
            }
        }
        return String.valueOf(str);
    }

    public static String joinToAll(String phrase) {
        return phrase.replace(" ", "");
    }
}
