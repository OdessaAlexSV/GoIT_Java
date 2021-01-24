package main.java;

/**
 * Напиши класс UniqueCharCounter. В этом классе создай метод public int count(String phrase),
 * который принимает строку и возвращает количество уникальных символов в этой строке.
 * Строка состоит лишь из цифр, символов английского алфавита, и пробелов.
 */

class UniqueCharCounter {
    public int count(String phrase) {
        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < phrase.length(); i++) {
            isItThere[phrase.charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true){
                count++;
            }
        }
        return count;
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}