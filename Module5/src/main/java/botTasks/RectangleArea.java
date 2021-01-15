package main.java.botTasks;

public class RectangleArea {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public RectangleArea(int[] coords) {
        this.x1 = coords[0];
        this.y1 = coords[1];
        this.x2 = coords[2];
        this.y2 = coords[3];
    }

    public int getArea() {
        double firstSide  = Math.sqrt((this.x2 - this.x1)*(this.x2 - this.x1));
        double secondSide = Math.sqrt((this.y2 - this.y1)*(this.y2 - this.y1));
        return (int) Math.round(firstSide * secondSide);
    }

}

class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}

