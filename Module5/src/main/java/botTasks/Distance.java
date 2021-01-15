package main.java.botTasks;

public class Distance {

    private int startX;
    private int startY;
    private int endY;
    private int endX;

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public int getDistance() {
        double distance = Math.sqrt((this.endY - this.startY) * (this.endY - this.startY) + (this.endX - this.startX) * (this.endX - this.startX));
        return (int) Math.round(distance);
    }
}

class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());

        //Expect 3
        System.out.println(new Distance(0, 0, 4, 0).getDistance());
    }
}