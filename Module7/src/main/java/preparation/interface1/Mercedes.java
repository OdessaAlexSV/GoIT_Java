package main.java.preparation.interface1;

public class Mercedes implements Car {
    @Override
    public void drive() {
        System.out.println("Drive comfortably");
    }

    @Override
    public int horsePower() {
        return 300;
    }
}
