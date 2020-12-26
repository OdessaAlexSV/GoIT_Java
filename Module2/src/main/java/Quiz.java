package main.java;

public class Quiz {
    public static void main(String[] args) {
        String variable = null;

//        if (variable != null & !variable.isEmpty()) {
//            System.out.println("not empty");
//        } else {
//            System.out.println("empty");
//        }

        if (variable == null || variable.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }

//        if (variable == null | variable.isEmpty()) {
//            System.out.println("empty");
//        } else {
//            System.out.println("not empty");
//        }

        if (variable != null && !variable.isEmpty()) {
            System.out.println("not empty");
        } else {
            System.out.println("empty");
        }
    }
}
