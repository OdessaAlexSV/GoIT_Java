package main.java;

/**
 * Напиши программу, которая будет определять, есть ли в тексте email.
 * Email считается найденным, если есть строка вида xx@xx, где вместо x - любой символ, кроме пробела.
 *
 * Задача
 * Напиши класс EmailDetector.
 * В этом классе создай метод public boolean isPresent(String text).
 * Он принимает строку и возвращает true лишь в том случае, если в ней есть email согласно описанному алгоритму.
 */

class EmailDetector {
    private static final int MINIMUM_LENGTH = 5;

    public boolean isPresent(String text) {
        if (text.length() < MINIMUM_LENGTH) {
            return false;
        }
        if (!text.contains("@")) {
            return false;
        }
        int i = text.indexOf("@");
        if (i < 2 || i > text.length() - 2) {
            return false;
        }
        if (checkIfNotContainsSpace(text, i)) {
            return true;
        }
        return false;
    }

    private static boolean checkIfNotContainsSpace(String text, int i) {
        if (text.charAt(i - 1) != ' ' && text.charAt(i - 2) != ' ' &&
                text.charAt(i + 1) != ' ' && text.charAt(i + 2) != ' ') {
            return true;
        }
        return false;
    }
}

class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}