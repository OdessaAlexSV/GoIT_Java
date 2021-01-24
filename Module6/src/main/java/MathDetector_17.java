package main.java;

/**
 * Напиши класс MathDetector.
 * В этом классе создай метод public boolean isMath(String text).
 * Этот метод принимает текст, и возвращает true, если в тексте есть математические выражения согласно алгоритма:
 * в тексте есть хотя бы один символ =;
 * в тексте есть хотя бы один математический оператор +, -, *, /;
 * в тексте есть минимум 2 цифры.
 */

class MathDetector {
    public boolean isMath(String text) {
        int found = 0;
        if (text.contains("=")) {
            found++;
        }

        if (text.contains("+") || text.contains("-") || text.contains("*") || text.contains("/")) {
            found++;
        }

        int[] arrInt = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberExist = 0;
        for (int i = 0; i < arrInt.length; i++) {
            int firstExist = text.indexOf(String.valueOf(arrInt[i]));
            int secondExist = text.lastIndexOf(String.valueOf(arrInt[i]));
            if (firstExist > -1) {
                numberExist++;
                if (firstExist > -1 && secondExist > -1 && firstExist != secondExist) {
                    found++;
                    i = arrInt.length;
                }
            }
            if (numberExist == 2) {
                found++;
                i = arrInt.length;
            }
        }

        if (found == 3) {
            return true;
        } else {
            return false;
        }
    }
}


class MathDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new MathDetector().isMath("2/2=4"));

        //false
        System.out.println(new MathDetector().isMath("1992 is great year"));

        //false
        System.out.println(new MathDetector().isMath("Venus vs Earth"));
    }
}