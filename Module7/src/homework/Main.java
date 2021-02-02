package homework;


public class Main {

    public static void main(String[] args) {
        PrintInfo printInfo = new PrintInfo();

        printInfo.print(new Circle());
        printInfo.print(new Circle(5));
        printInfo.print(new Quad());
        printInfo.print(new Quad(6,8));
        printInfo.print(new Square());
        printInfo.print(new Square(5));
        printInfo.print(new Rhombus());
        printInfo.print(new Rhombus(6,8));
        printInfo.print(new Triangle());
        printInfo.print(new Triangle(6,8,12));
    }
}
