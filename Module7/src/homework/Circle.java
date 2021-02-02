package homework;

import static java.lang.Math.pow;

public class Circle implements Shape {
    private final static int DEFAULT_RADIUS = 6;
    private int radius;

    public Circle() {
        this(DEFAULT_RADIUS);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String printName() {
        return "a circle with radius " + this.radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }
}
