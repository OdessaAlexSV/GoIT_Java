package main.java;

/**
 * Напиши класс NameCounter.
 * В этом классе создай метод public int count(String text).
 * Он возвращает количество имен собственных согласно алгоритма, описанного выше.
 *
 * Именем собственным считается слово, в котором есть хотя бы две буквы. Первая буква должна быть большой, все остальные - маленькими.
 */

class NameCounter {
    public int count(String text) {
        String[] arrWords = text.split(" ");
        int isAccept = arrWords.length;

        for (String word : arrWords) {
            int notAccept = 0;
            if (word.length() <= 2) {
                notAccept++;
            }

            if (notAccept==0 && !Character.isUpperCase(word.charAt(0))) {
                notAccept++;
            }

            if(notAccept==0) {
                for (int i = 1; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        notAccept++;
                    }
                }
            }

            if (notAccept > 0) {
                isAccept--;
            }

        }
        return isAccept;
    }
}

class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}
