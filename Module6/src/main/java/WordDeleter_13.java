package main.java;

/**
 * Напиши класс WordDeleter.
 * У этого класса создай метод public String remove(String phrase, String[] words).
 * Этот метод принимает строку phrase, которая состоит из отдельных слов, разделенных ровно одним пробелом, и удаляет из нее все слова, указанные в массиве words.
 * * Возвращается строка без этих слов. Оставшиеся слова должны так же быть разделены ровно одним пробелом.
 */

class WordDeleter {
    public String remove(String phrase, String[] words) {
        int i = 0;
        String[] arr = phrase.split(" ");
        for (int j = 0; j < words.length; j++) {
            String[] arrayWords = words[j].split(",");
            for (String word : arrayWords) {
                for (String str : arr) {
                    if (str.equals(word.trim())) {
                        arr[i] = " ";
                    }
                    i++;
                }
                i = 0;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            if (s != " ") {
                builder.append(s + " ");
            }
        }
        return builder.toString().strip();
    }
}

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("Hello Java", new String[]{"Java"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[]{"is"}));

        //objiqono taizdop
        System.out.println(wordDeleter.remove("objiqono taizdop zawofu", new String[]{"zawofu"}));

        //mynopybi matajilyh mynopybi objiqono
        System.out.println(wordDeleter.remove("mynopybi matajilyh mynopybi hidi objiqono", new String[]{"hidi"}));

        //evrudejy objiqono
        System.out.println(wordDeleter.remove("zawofu evrudejy ibfe objiqono potou", new String[]{"ibfe, potou, zawofu"}));
    }
}