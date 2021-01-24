package main.java;

/**
 * Напиши класс DigitExtracter.
 * В этом классе создай метод public int[] extract(String text).
 * Метод принимает строку, и возвращает массив всех цифр, которые есть в этой строке, в том же порядке, в котором они встречаются.
 */

import java.util.Arrays;

class DigitExtracter {
    public int[] extract(String text) {
        String[] arrChars = text.replace(" ","").split("");
        int[] arrDigitCurrent = new int[arrChars.length];
        int i = 0;
        for (String symbol : arrChars) {
            if(symbol.equals("0")
            || symbol.equals("1") || symbol.equals("2") || symbol.equals("3")
            || symbol.equals("4") || symbol.equals("5") || symbol.equals("6")
            || symbol.equals("7") || symbol.equals("8") || symbol.equals("9"))
            {
                arrDigitCurrent[i] = Integer.parseInt(symbol);
                i++;
            }
        }

        int[] arrDigit = Arrays.copyOf(arrDigitCurrent, i);
        return arrDigit;
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}