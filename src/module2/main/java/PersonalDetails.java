package module2.main.java;

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name: ");
        String name = in.nextLine();
        System.out.print("What city do you live in: ");
        String city = in.nextLine();
        System.out.print("How old are you: ");
        int age = in.nextInt();
        in.nextLine();
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
                          "\n%d - Age"  +
                          "\n%s - Hobby",
                          name, city, age, hobby);
        in.close();
    }
}
