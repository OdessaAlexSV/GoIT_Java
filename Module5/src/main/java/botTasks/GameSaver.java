package main.java.botTasks;

/**
 * Допиши в классе GameSaver статический блок инициализации, чтобы при создании первого объекта GameSaver в консоль выводился текст GameSaver created!.
 */

public class GameSaver {

    static {
        System.out.println("GameSaver created!");
    }

    {
        System.out.println("Boom!");
    }
}

class GameSaverTest {
    public static void main(String[] args) {
        //GameSaver created!
        for (int i = 0; i < 10; i++) {
            new GameSaver();
        }
    }
}


