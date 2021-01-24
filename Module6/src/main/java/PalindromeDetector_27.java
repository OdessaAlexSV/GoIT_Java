package main.java;

/**
 * Следующий кандидат на исправление - класс PalindromeDetector.
 * Этот класс имеет метод isPalindrome(String word), который принимает строку, и возвращает true, если переданое слово является палиндромом (читается одинаково с любой стороны).
 *
 * Алгоритм работы простой.
 * Берется исходная строка, разворачивается (используя метод reverse(String word) из класса PalindromeDetector),
 * и эта развернутая строка сравнивается с оригинальной, используя метод equalsIgnoreCase().
 *
 * Проблема именно в методе reverse(String word).
 * Внутри этого метода строка разбивается на массив символов, и дальше в цикле все это склеивается в новую строку.
 *
 * На больших данных такой подход приведет к проблемам.
 *
 * В то же время у класса StringBuilder есть удобный метод reverse(), который идеально решает эту узкую задачу.
 *
 * Задача
 * Перепиши метод reverse(String word) у класса PalindromeDetector, чтобы избавиться от цикла, и использовать метод reverse() класса StringBuilder для разворачивания строки.
 */

/*OLD
class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        String result = "";
        char[] chars = word.toCharArray();
        for(char c: chars) {
            result = c + result;
        }
        return result;
    }
}
*/

class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder result = new StringBuilder(word);
        System.out.println(word);
        System.out.println(result.reverse().toString());

        return result.reverse().toString();
    }
}

class PalindromeDetectorTest {
    public static void main(String[] args) {
        //false
        System.out.println(new PalindromeDetector().isPalindrome("Java"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Noon"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("doxolappaloxod"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Wyfatoerfjfreotafyw"));

        //true
        System.out.println(new PalindromeDetector().isPalindrome("Pubaxoccoxabup"));

    }
}
