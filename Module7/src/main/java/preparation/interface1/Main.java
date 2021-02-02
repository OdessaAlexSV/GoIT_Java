package main.java.preparation.interface1;

public class Main {
    public static void main(String[] args) {
        Car car = new Volvo();
        car.drive();
        System.out.println(car.horsePower());
        ((Volvo) car).transmissionType();

        car = new Mercedes();
        car.drive();
        System.out.println(car.horsePower());

        Animal dog = new Dog();
        dog.animalSound();
        dog.sleep();

    }

}
