package main.java.botTasks;

/**
 * Напиши класс-синглтон TexturePool.
 * У этого класса должен быть метод public String getTexture(String textureName).
 * Этот метод возвращает строку Get texture <TEXTURE_NAME>.
 * Вместо <TEXTURE_NAME> должно быть имя текстуры, которое передается как параметр в метод getTexture().
 */


public class TexturePool_24 {

    private static TexturePool_24 instance = new TexturePool_24();

    private TexturePool_24() {

    }

    public static TexturePool_24 getInstance() {
        return instance;
    }

    public String getTexture(String textureName) {
        return "Get texture " + textureName;
    }
}

class TexturePoolTest_24 {
    public static void main(String[] args) {
        System.out.println(TexturePool_24.getInstance().getTexture("MainHero"));
        System.out.println(TexturePool_24.getInstance() == TexturePool_24.getInstance());
    }
}