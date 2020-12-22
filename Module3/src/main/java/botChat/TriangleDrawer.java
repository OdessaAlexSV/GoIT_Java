package main.java.botChat;

public class TriangleDrawer {

    public void drawTriangleNew(int side) {
        while (side >= 1) {
           System.out.print("*".repeat(side));
           side--;
           System.out.println();
        }
    }

    public String drawTriangle(int side) {
        String result = "";
        while (side >= 1) {
            result += "*".repeat(side) + "\n";
            side--;
        }
        return result;
    }

    public static void main(String[] args) {
        TriangleDrawer triangle = new TriangleDrawer();

        triangle.drawTriangleNew(7);

        System.out.println(new TriangleDrawer().drawTriangle(5));
    }

}
