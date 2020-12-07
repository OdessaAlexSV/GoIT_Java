package main.java;

import java.util.Scanner;

public class GreedGame {

    public static void main(String[] args) {

        int sum = 0;
        int num1 = 0, num2 = 0, num3 = 0;
        int num4 = 0, num5 = 0, num6 = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Please, input any 5 digits (from 1 to 6 separated by a space) :");
        String numbers = in.nextLine();

        while (!numbers.matches("[0-6]\\s+[0-6]\\s+[0-6]\\s+[0-6]\\s+[0-6]+")) {
            System.out.println("Invalid inputs");
            System.out.println("Please, input again any 5 digits (from 1 to 6 separated by a space) :");
            numbers = in.nextLine();
        }

        String[] res = numbers.split("\\s");

        for (int i = 0; i < res.length; i++)
              switch (res[i]) {
                case "1":
                    sum += 100;
                    num1++;
                    if (num1 == 3) {
                        sum = (sum - 300) + 1000;
                        num1 = 0;
                    }
                    break;
                case "2":
                    num2++;
                    if (num2 == 3) {
                        sum += 200;
                        num2 = 0;
                    }
                    break;
                case "3":
                    num3++;
                    if (num3 == 3) {
                        sum += 300;
                        num3 = 0;
                    }
                    break;
                case "4":
                    num4++;
                    if (num4 == 3) {
                        sum += 400;
                        num4 = 0;
                    }
                    break;
                case "5":
                    sum += 50;
                    num5++;
                    if (num5 == 3) {
                        sum = (sum - 150) + 500;
                        num5 = 0;
                    }
                    break;
                case "6":
                    num6++;
                    if (num6 == 3) {
                        sum += 600;
                        num6 = 0;
                    }
                    break;
            }
        System.out.println("Sum is: " + sum);
        in.close();
    }
}







