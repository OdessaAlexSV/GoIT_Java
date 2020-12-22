package main.java.botChat;

import java.util.Scanner;

public class MoonComputerTests_1 {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        scanner.close();
    }

    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests_1 computerTests = new MoonComputerTests_1();
        computerTests.testBasicInputOutput();
    }
}

