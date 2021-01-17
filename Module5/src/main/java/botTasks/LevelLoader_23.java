package main.java.botTasks;

/**
 * Ты написал уже почти готовый синглтон.
 * Единственный момент - еще можно создать новые экземпляры класса LevelLoader оператором new в стороннем коде.
 *
 * Задание
 * Создай в классе LevelLoader приватный конструктор без параметров. Других конструкторов быть не должно.
 */

class LevelLoader_23 {
    private static LevelLoader_23 instance = new LevelLoader_23();

    private LevelLoader_23() {
    }

    public static LevelLoader_23 getInstance() {
        return instance;
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class LevelLoaderTest_23 {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader_23.getInstance().load("StartLevel"));
    }
}