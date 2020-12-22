package main.java.botChat;

import java.util.Scanner;

public class MoonComputerTests_2 {

    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        boolean line = scanner.nextBoolean();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        int sub = a - b;
        int multiply = a * b;
        int divide = a / b;

        System.out.println(sum + " " + sub + " " + multiply + " " + divide);

        scanner.close();
    }

    //Test output on true, true, false standard input
    public static void main(String[] args) {
        new MoonComputerTests_2().testMath();
    }

}
