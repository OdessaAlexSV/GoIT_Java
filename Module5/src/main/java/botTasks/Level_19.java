package main.java.botTasks;

public class Level_19 {

    private LevelInfo levelInfo;
    private Point[] points;

    public Level_19(LevelInfo levelInfo, Point[] points) {
        this.levelInfo = levelInfo;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelInfo.getName() + ", difficulty is " + levelInfo.getDifficulty() + ", point count is " + points.length;
    }

    static class Point {
        private int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static class LevelInfo {
        private String name;
        private String difficulty;

        public LevelInfo(String name, String difficulty) {
            this.name = name;
            this.difficulty = difficulty;
        }

        public String getName() {
            return name;
        }

        public String getDifficulty() {
            return difficulty;
        }
    }

    public int calculateLevelHash() {
        int hashSum = 0;
        for (int i = 0; i < points.length; i++) {
            hashSum += points[i].getX()*points[i].getY();
        }
        return hashSum;
    }
}

class LevelTest_19 {
    public static void main(String[] args) {
        Level_19.Point p1 = new Level_19.Point(3, 5);
        Level_19.Point p2 = new Level_19.Point(10, 100);
        Level_19.Point p3 = new Level_19.Point(50, 40);

        Level_19.Point[] points = {p1, p2, p3};

        Level_19.LevelInfo info = new Level_19.LevelInfo("Quarke Intro", "Easy");

        //3015
        System.out.println(new Level_19(info, points).calculateLevelHash());
    }


}
