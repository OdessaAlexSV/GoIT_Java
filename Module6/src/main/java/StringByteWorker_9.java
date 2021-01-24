package main.java;

/**
 * Напиши класс StringByteWorker.
 * В этом классе создай метод public String process(byte[] bytes).
 * Метод принимает на вход массив байт, делает из этого массива строку, приводит ее в нижний регистр, и возвращает эту строку.
 */

public class StringByteWorker {
    public String process(byte[] startBytes) {
        return new String(startBytes).toLowerCase();
    }
}

class StringByteWorkerTest {
    public static void main(String[] args) {
        byte[] startBytes = {74, 97, 86, 97};

        //java
        System.out.println(new StringByteWorker().process(startBytes));
    }
}
