package homework;

public class Quad implements Shape {
    private int length;
    private int width;
    private static final int DEFAULT_LENGTH = 4;
    private static final int DEFAULT_WIDTH = 6;

    public Quad() {
        this(DEFAULT_LENGTH,DEFAULT_WIDTH);
    }

    public Quad(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String printName() {
        return "a quad with sides " + this.length + "x" + this.width;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public double perimeter() {
        return 2 * this.length + 2 * this.width;
    }
}
