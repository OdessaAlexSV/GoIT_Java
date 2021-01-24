package main.java;

/**
 * Напиши программу, которая принимает строку, и возвращает строку по следующим критериям:
 * если количество маленьких букв в строке больше чем количество больших букв - возвращается Small;
 * если количество больших букв больше чем количество маленьких - возвращается Big;
 * если количество больших и маленьких букв равно - возвращается Same.
 * Пробелы в тексте игнорируй.
 * <p>
 * Задача
 * Напиши класс BigOrSmall. В этом классе создай метод public String calculate(String text).
 * Метод принимает строку, и возвращает строку согласно критериям выше.
 */

class BigOrSmall {
    public String calculate(String text) {
        int countCapital = 0;
        int countSmall = 0;
        String res = null;
        for (char ch : text.replace(" ", "").toCharArray()) {
            if (Character.isUpperCase(ch)) {
                countCapital++;
            } else {
                countSmall++;
            }
        }
        if (countSmall > countCapital) {
            res = "Small";
        }
        if (countCapital > countSmall) {
            res = "Big";
        }
        if (countSmall == countCapital) {
            res = "Same";
        }

        return res;
    }
}

class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}