package main.java.botTasks;

public class Level_17 {
    private String levelName;
    private Point[] points;

    public Level_17(String levelName, Point[] points) {
        this.levelName = levelName;
        this.points = points;
    }

    @Override
    public String toString() {
        return "Quarke level, name is " + levelName + ", point count is " + points.length;
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
}

class LevelTest_17 {
    public static void main(String[] args) {
        Level_17.Point p1 = new Level_17.Point(3, 5);
        Level_17.Point p2 = new Level_17.Point(10, 100);
        Level_17.Point p3 = new Level_17.Point(50, 40);

        Level_17.Point[] points = {p1, p2, p3};

        //Quarke level, name is Test, point count is 3
        System.out.println(new Level_17("Test", points));
    }
}