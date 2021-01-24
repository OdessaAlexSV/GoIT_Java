package practice;

public class AreaVisibilityPrimitiv {
    private int c = 10;

    public static void main(String[] args) {
        int b = 10;
        method1(b);
        int c = method1(b);
        System.out.println(b);
        System.out.println(c);
    }

    private static int method1(int b) {
        return b= 30;
    }
}
