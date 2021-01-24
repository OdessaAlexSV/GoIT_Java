package main.java;

/**
 * Водянистостью будем называть отношение числа пробелов в тексте к общему количеству символов в тексте.
 *
 * Задача
 * Напиши класс WaterCounter. В этом классе создай метод public double count(String text). Он принимает строку, и возвращает водянистость - отношение количества пробелов в тексте к общему количеству символов в тексте.
 * Никак не округляй возвращаемый результат.
 */

class WaterCounter {
    public double count(String text) {
        int countGap = 0;
        for (char chr : text.toCharArray()) {
            if (chr == ' ') {
                countGap++;
            }
        }
        return (double) countGap/text.length();
    }
}

class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
