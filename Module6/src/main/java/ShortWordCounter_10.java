package main.java;

/**
 * Напиши класс ShortWordCounter.
 * В этом классе создай метод public int count(String phrase, int minLength).
 * Метод принимает на вход строку phrase и переменную minLength.
 * Возвращает количество слов, которые меньше или равны чем minLength.
 * Строка состоит исключительно из цифр и букв английского алфавита, слова разделены одним пробелом, знаков пунктуации нет.
 */

class ShortWordCounter {
    public int count(String phrase, int minLength) {
        int count = 0;
        String[] arr = phrase.toLowerCase().split(" ");
        for (String word : arr) {
            if (word.length() <= minLength) {
                count++;
            }
        }
        return count;
    }
}

class ShortWordCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new ShortWordCounter().count("Java is great language", 2));

        //2
        System.out.println(new ShortWordCounter().count("Java is great language", 4));

        //3
        System.out.println(new ShortWordCounter().count("Java is great language", 5));

        //4
        System.out.println(new ShortWordCounter().count("Java is great language", 100));
    }
}