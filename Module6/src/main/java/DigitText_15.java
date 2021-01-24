package main.java;

/**
 * Напиши программу, которая будет определять, является ли текст состоящим исключительно из цифр и пробелов.
 * Задача
 * Напиши класс DigitText.
 * В этом классе создай метод public boolean detect(String text).
 * Он принимает строку и возвращает true в случае, если строка состоит исключительно из цифр и пробелов.
 */

class DigitText {
    public boolean detect(String text) {
        return text.matches("^[0-9\\s]+$");
    }
}

class DigitTextTest {
    public static void main(String[] args) {
        //true
        System.out.println(new DigitText().detect("23 50"));

        //false
        System.out.println(new DigitText().detect("Year 1990"));

        //false
        System.out.println(new DigitText().detect("32 feqi 38 wopu vyu"));
    }
}