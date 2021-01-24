package practice;

public class AreaVisibilityObject {

    private int c = 10;

    public static void main(String[] args) {
        TestObject obj = new TestObject();
        obj.setB(10);
        method1(obj);
        System.out.println(obj.getB());
    }

    private static void method1(TestObject obj) {
        obj.setB(20);
    }
}
