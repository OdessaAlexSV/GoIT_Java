package main.java.botChat;

import java.util.Scanner;

public class PassportFormCreator {

    public void createForms() {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = scanner.nextInt();

        System.out.println(firstName + " " + lastName + " " + age * 10);
        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toUpperCase());
        System.out.println(age * 10);

        scanner.close();
    }


    public static void main(String[] args) {

        PassportFormCreator passport = new PassportFormCreator();
        passport.createForms();

    }

}
