package main.java;

/**
 * Напиши класс PunctuationMarkCounter.
 * В этом классе создай метод public int count(String phrase).
 * Он принимает строку, и возвращает количество знаков пунктуации в этой строке.
 * Знаками пунктуации считаются следующие: ., ,, !, :, ;.
 */

class PunctuationMarkCounter {
    public int count(String phrase) {
        int countPuncMarks = 0;
        for (int i = 0; i < phrase.length(); i++) {
            //Checks whether given character is punctuation mark
            if(phrase.charAt(i) == '!' || phrase.charAt(i) == ',' || phrase.charAt(i) == ';' || phrase.charAt(i) == '.' || phrase.charAt(i) == '?' || phrase.charAt(i) == '-' ||
                    phrase.charAt(i) == '\'' || phrase.charAt(i) == '\"' || phrase.charAt(i) == ':') {
                countPuncMarks++;
            }
        }
        return countPuncMarks;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}