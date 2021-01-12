package main.java.botChat;

public class QuadraticEquationSolver {

    public double[] solve(int a, int b, int c) {
        double Discriminant = Math.pow(b,2) - 4 * a * c;

        if (Discriminant > 0) {
            double[] routes = new double[2];
            routes[0] = ((-1)*b + Math.sqrt(Discriminant)) / (2 * a);
            routes[1] = ((-1)*b - Math.sqrt(Discriminant)) / (2 * a);
            return routes;
        } else {
            if (Discriminant == 0) {
                double[] routes = new double[1];
                routes[0] = (-1)*b / (2 * a);
                return routes;
            } else {
                double[] routes = new double[0];
                return routes;
            }
        }
    }

    public static void main(String[] args) {
        QuadraticEquationSolver example = new QuadraticEquationSolver();
        double[] result = example.solve(2, -24, 72);
        for (double route : result){
            System.out.println(route);
        }
    }
}
