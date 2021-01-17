package main.java.botTasks;

public class Level_16 {
    private String levelName;

    public Level_16(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelName;
    }
}
class LevelTest_16 {
    public static void main(String[] args) {
        //Quarke level, name is Test
        System.out.println(new Level_16("Test"));
    }
}