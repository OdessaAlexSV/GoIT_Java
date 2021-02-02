package homework;

public class Rhombus implements Shape {
    private int d1, d2; // diagonals
    private static final int DEFAULT_DIAGONAL_1 = 2;
    private static final int DEFAULT_DIAGONAL_2 = 3;

    public Rhombus() {
        this(DEFAULT_DIAGONAL_1, DEFAULT_DIAGONAL_2);
    }

    public Rhombus(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    @Override
    public String printName() {
        return "a rhombus with diagonals " + this.d1 + "x" + this.d2;
    }

    @Override
    public double area() {
        return (this.d1 * this.d2) / 2;
    }

    @Override
    public double perimeter() {
        return 4 * Math.sqrt(Math.pow(this.d1 / 2, 2) + Math.pow(this.d2 / 2, 2));
    }
}
