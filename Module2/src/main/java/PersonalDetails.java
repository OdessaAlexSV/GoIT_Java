package main.java;

/**
 * Написать программу, которая делает следующее:
 * спрашивает у пользователя имя (String)
 * спрашивает у пользователя город проживания (String)
 * спрашивает у пользователя возраст (int)
 * спрашивает у пользователя хобби (String)
 * перед каждым вводом данных, программа должна вывести информацию пользователю с требованием ввода соответствующей информации.
 * программа выводит красиво оформлено всю информацию о пользователе в трех разных вариантах:
 * ----------------------------------
 * Вариант 1 (табличный):
 * Имя:               хххххх
 * Город:            хххххх
 * Возраст:        хххххх
 * Хобби:           хххххх
 * ----------------------------------
 * Вариант 2 (текстовый):
 * Человек по имени хххххх живет в городе хххххх.
 * Этому человеку хххххх лет и любит он заниматься хххххх.
 * ----------------------------------
 * Вариант 3 (иной):
 * хххххх - имя
 * хххххх - город
 * хххххх - возраст
 * хххххх - хобби
 */

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.nextLine();
        System.out.print("What city do you live in: ");
        String city = in.nextLine();
        System.out.print("How old are you: ");
        int age = Integer.parseInt(in.nextLine());
//-----------------------
//        int age;
//        try {
//            age = Integer.parseInt(in.nextLine());
//        } catch (Exception e){
//            System.out.println("How old are you: ");
//            age = Integer.parseInt(in.nextLine());
//        }
//-----------------------
//        int age = in.nextInt();
//        in.nextLine();
//-----------------------

        System.out.print("What is your hobby: ");
        String hobby = in.nextLine();

        System.out.println();
        System.out.printf("Name:\t %s" +
                        "\nCity:\t %s" +
                        "\nAge:\t %d" +
                        "\nHobby:\t %s",
                name, city, age, hobby);

        System.out.println();
        System.out.println();
        System.out.printf("Man(Woman) named %s lives in the city %s" +
                "\nHe(She) is %d years old and lives doing %s", name, city, age, hobby);

        System.out.println();
        System.out.println();
        System.out.printf("%s - Name" +
                        "\n%s - City" +
                        "\n%d - Age" +
                        "\n%s - Hobby",
                name, city, age, hobby);
        in.close();
    }
}
