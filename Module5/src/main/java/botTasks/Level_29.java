package main.java.botTasks;

class Level_29 {
    private int width;
    private int height;

    public Level_29(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

class LevelLoader_29 {
    public void load(Level_29 level) throws LevelTooBigException_29 {
        if (level.getHeight() * level.getWidth() <= 100000) {
            System.out.println("Level loaded");
        } else {
            throw new LevelTooBigException_29();
        }
    }
}

class LevelLoaderTest_29 {
    public static void main(String[] args) {
        //Level loaded
        try {
            new LevelLoader_29().load(new Level_29(10, 20));
        } catch (LevelTooBigException_29 ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new LevelLoader_29().load(new Level_29(10000, 2000));
        } catch (LevelTooBigException_29 ex) {
            System.out.println("Level too big");
        }
    }
}

class LevelTooBigException_29 extends Exception {
}
