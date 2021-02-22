package main.java.botTasks;

/**
 * Напиши класс Distance, у которого есть конструктор Distance(int startX, int startY, int endX, int endY).
 * Этот конструктор принимает 4 параметра - координаты начальной точки (startX и startY), и координаты конечной точки (endX и endY).
 * У класса также должен быть метод public int getDistance().
 * Он возвращает расстояние между точками, координаты которых переданы в конструктор.
 * Расстояние округляется по правилам математического округления, возвращается целый результат.
 */


public class Distance_10 {

    private int startX;
    private int startY;
    private int endY;
    private int endX;

    public Distance_10(int startX, int startY, int endX, int endY) {
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
        System.out.println(new Distance_10(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance_10(10, 10, 27, 25).getDistance());

        //Expect 3
        System.out.println(new Distance_10(0, 0, 4, 0).getDistance());
    }
}