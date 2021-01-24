package main.java;

/**
 * Напиши класс AvgWordLength.
 * В этом классе напиши метод public double count(String phrase).
 * Метод принимает строку, состояющую из слов, разделенных ровно одним пробелом, и возвращает среднюю длину слова в этой строке.
 */

class AvgWordLength {
    public double count(String phrase) {
        String[] arr = phrase.split(" ");
        int count = 0;
        int totalLenght = 0;
        for (String word : arr) {
            count++;
            totalLenght += word.length();
        }
        return (double) totalLenght / count;
    }
}

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}