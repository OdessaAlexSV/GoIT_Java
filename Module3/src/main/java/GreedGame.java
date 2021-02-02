package main.java;

/**
 * Greed - это игра, в которой используется 5 игральных костей. Ваша задача посчитать количество очков за ход.
 * Пользователь вводит в консоль строку из 5 цифр от 1 до 6, разделенные пробелом.
 * Очки считаются по следующим правилам:
 * Три 1 = 1000 очков
 * Три 6 = 600 очков
 * Три 5 = 500 очков
 * Три 4 = 400 очков
 * Три 3 = 300 очков
 * Три 2 = 200 очков
 * Одна 1 = 100 очков
 * Одна 5 = 50 очков
 * Если какая-либо кость задействована для очков за триплет, то за нее не начисляются баллы, как за одну кость (например, 555 = "Три 5" = 500 очков, а не 500 + 50 ("Одна 5") за каждую ).
 * Пример:
 * 5 1 3 4 1   50 + 2 * 100 = 250
 * 1 1 1 3 1   1000 + 100 = 1100
 * 2 4 4 5 4   400 + 50 = 450
 * Примечание:
 * Получить массив из строки поможет метод String#split(regex).
 * Дополнительно:
 * Убедитесь, что пользователь вводит корректные данные в консоль (см. метод String.matches(regex). В случае некорректного ввода - просите повторить ввод и заново валидируйте.
 */

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