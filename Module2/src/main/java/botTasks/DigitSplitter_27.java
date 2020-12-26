package main.java.botTasks;

public class DigitSplitter_27 {
    public int getFirstDigit(int number) {
        return number / 10;
    }

    public int getSecondDigit(int number) {
        return number % 10;
    }

    public static void main(String[] args) {

        DigitSplitter_27 num = new DigitSplitter_27();

        System.out.println(num.getFirstDigit(15));
        System.out.println(num.getSecondDigit(15));
    }
}