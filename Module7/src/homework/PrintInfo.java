package homework;

public class PrintInfo {
    public void print(Shape figure) {
        System.out.printf("Current figure is %s \n", figure.printName());
        System.out.printf("Area is %.2f \n", figure.area());
        System.out.printf("Perimeter is %.2f \n", figure.perimeter());
        System.out.println("-".repeat(15));
    }
}
