package main.java;

/**
 * Напиши класс WordSplitter. В этом классе создай метод public String[] split(String phrase).
 * Метод принимает на вход строку, разделяет ее на слова, и возвращает массив строк. Каждая строка - отдельное слово.
 * Словом считается любая последовательность символов, кроме пробелов.
 * Гарантируется, что входная строка содержит лишь символы английского алфавита, цифры и пробелы.
 */

import java.util.Arrays;

class WordSplitter {
    public String[] split(String phrase) {
        return  phrase.trim().toLowerCase().split("\\s+");
    }
}

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}