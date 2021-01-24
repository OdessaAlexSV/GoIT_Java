package main.java;

/**
 * Чуствительными данными считаются слова: pass, key, login, email в любом регистре.
 * Напиши класс SensitiveDataSearcher.
 * У этого класса создай метод public boolean isSensitiveDataPresent(String phrase).
 * Он принимает строку, и возвращает true, если в строке есть чуствительные данные.
 */

class SensitiveDataSearcher {

    public boolean isSensitiveDataPresent(String phrase) {
        boolean res = false;
        String sensitiveWords = "pass, key, login, email";
        String[] words = sensitiveWords.split(",");
        for (int i = 0; i < words.length; i++) {
            if (phrase.toLowerCase().contains(words[i].toLowerCase().trim())) {
                res = true;
                i=words.length;
            }
        }
        return res;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}