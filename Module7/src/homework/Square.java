package homework;

public class Square implements Shape{
    private int side;
    private static final int DEFAULT_SIDE = 4;

    public Square() {
        this(DEFAULT_SIDE);
    }

    public Square(int side) {
        this.side = side;
    }

    @Override
    public String printName() {
        return "a square with side " + this.side;
    }

    @Override
    public double area() {
        return Math.pow(this.side,2);
    }

    @Override
    public double perimeter() {
        return 4 * this.side;
    }
}
