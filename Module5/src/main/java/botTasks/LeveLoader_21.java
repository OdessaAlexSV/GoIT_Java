package main.java.botTasks;

/**
 * Напиши класс LevelLoader.
 * У этого класса создай метод String load(String levelName).
 * Метод принимает один параметр - имя уровня, и возвращает строку Loading level <LEVEL_NAME> ..., где вместо <LEVEL_NAME> подставляется переданное имя уровня.
 */

class LevelLoader_21 {

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }

}

class LevelLoaderTest_21 {
    public static void main(String[] args) {
        LevelLoader_21 levelLoader = new LevelLoader_21();

        //Loading level Startlevel ...
        System.out.println(levelLoader.load("StartLevel"));
    }
}