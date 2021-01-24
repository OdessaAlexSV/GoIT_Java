package main.java;

/**
 * Напиши класс PalindromeCounter.
 * В классе создай метод public int count(String phrase).
 * Метод принимает строку, которая состоит из слов, разделенных одним пробелом, и возвращает количество палиндромов в этой строке.
 * Палиндром - это слово, которое читается одинаково в обе стороны.
 * Например, слово "казак" - палиндром.
 */

class PalindromeCounter {
    public int count(String phrase) {
        int count = 0;
        String[] arr = phrase.split(" ");
        for (String word : arr) {
            StringBuilder wordReverse = new StringBuilder(word.toLowerCase()).reverse();
            if ( (word.toLowerCase()).equals(wordReverse.toString())){
                count++;
            }
        }
        return count;
    }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));
    }
}

