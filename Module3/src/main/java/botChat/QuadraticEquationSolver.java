package main.java.botChat;

import java.util.Arrays;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        double Discriminant = Math.pow(b, 2) - 4 * a * c;

        if (Discriminant > 0) {
            double[] routes = new double[2];
            routes[0] = ((-1) * b + Math.sqrt(Discriminant)) / (2 * a);
            routes[1] = ((-1) * b - Math.sqrt(Discriminant)) / (2 * a);
            return routes;
        } else {
            if (Discriminant == 0) {
                double[] routes = new double[1];
                routes[0] = (-1) * b / (2 * a);
                return routes;
            } else {
                double[] routes = new double[0];
                return routes;
            }
        }
    }

    public double[] solve1(int a, int b, int c) {
        int d = (b * b) - (4 * a * c);
        if (d > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[]{x1, x2};
        } else if (d == 0) {
            double x = -b / (2 * a);
            return new double[]{x};
        } else {
            return new double[0];
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver example = new QuadraticEquationSolver();
        System.out.println(Arrays.toString(example.solve(2, -24, 72)));
        System.out.println(Arrays.toString(example.solve(1, -2, -3)));
        System.out.println(Arrays.toString(example.solve(1, 12, 36)));
        System.out.println(Arrays.toString(example.solve(5, 3, 7)));
        System.out.println("+".repeat(15));
        System.out.println(Arrays.toString(example.solve1(2, -24, 72)));
        System.out.println(Arrays.toString(example.solve1(1, -2, -3)));
        System.out.println(Arrays.toString(example.solve1(1, 12, 36)));
        System.out.println(Arrays.toString(example.solve1(5, 3, 7)));
    }
}

