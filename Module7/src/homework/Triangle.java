package homework;

public class Triangle implements Shape {
    private int side1, side2, side3;
    private static final int DEFAULT_SIDE1 = 3;
    private static final int DEFAULT_SIDE2 = 4;
    private static final int DEFAULT_SIDE3 = 5;

    public Triangle() {
        this(DEFAULT_SIDE1,DEFAULT_SIDE2,DEFAULT_SIDE3);
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String printName() {
        return "a triangle with sides " + this.side1 + "x" +  this.side2 + "x" + this.side3;
    }

    @Override
    public double area() {
        float p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    @Override
    public double perimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}
