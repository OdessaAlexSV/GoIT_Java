package main.java.botTasks;

/**
 * Отлично, базовый загрузчик уровней написан. Теперь давай начнем трансформацию класса LevelLoader_22 в синглтон.
 *
 * Задание
 * Первое действие - нужно добавить приватное статическое поле с именем instance типа LevelLoader_22 в класс LevelLoader_22.
 * Это поле сразу инициализируй новым экземпляром LevelLoader_22 (вызовом new LevelLoader_22()).
 *
 * Создай статический публичный метод LevelLoader_22 getInstance(), который будет возвращать instance.
 *
 * Примеры тестов
 * выполнение кода LevelLoader_22.getInstance().load("StartLevel") возвращает строку Loading level StartLevel ...;
 * выполнение кода LevelLoader_22.getInstance() == LevelLoader_22.getInstance() возвращает true, потому что метод getInstance() возвращает ссылку на один и тот же объект.
 */

class LevelLoader_22 {
    private static LevelLoader_22 instance = new LevelLoader_22();

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }

    public static LevelLoader_22 getInstance() {
        return instance;
    }
}

class LevelLoaderTest_22 {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader_22.getInstance().load("StartLevel"));
    }
}
