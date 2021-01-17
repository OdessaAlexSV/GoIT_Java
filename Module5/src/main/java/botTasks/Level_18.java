package main.java.botTasks;

class Level_18 {
    private Point[] points;
    private LevelInfo levelInfo;

    public Level_18(LevelInfo levelInfo, Point[] points) {
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
}

class LevelTest_18 {
    public static void main(String[] args) {
        Level_18.Point p1 = new Level_18.Point(3, 5);
        Level_18.Point p2 = new Level_18.Point(10, 100);
        Level_18.Point p3 = new Level_18.Point(50, 40);

        Level_18.Point[] points = {p1, p2, p3};

        Level_18.LevelInfo info = new Level_18.LevelInfo("Quarke Intro", "Easy");

        //Quarke level, name is Quarke Intro, difficulty is Easy, point count is 3
        System.out.println(new Level_18(info, points));
    }
}