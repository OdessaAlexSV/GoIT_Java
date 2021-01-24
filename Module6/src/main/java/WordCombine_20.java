package main.java;

/**
 * Напиши класс WordCombine.
 * В этом классе создай метод public boolean canCombine(String sourceWord, String targetWord).
 * Он должен возвращать true лишь в том случае, если из слова sourceWord можно составить слово targetWord.
 *
 * Буквы можно использовать сколько угодно раз. Регистр букв не учитывай.
 */

class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord) {
        for (char ch : targetWord.toLowerCase().toCharArray()) {
            if (sourceWord.toLowerCase().indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}