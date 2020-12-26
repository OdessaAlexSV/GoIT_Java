package main.java.botTasks;

public class NumberTester_25 {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    //Test output
    public static void main(String[] args) {
        NumberTester_25 tester = new NumberTester_25();
        System.out.println(tester.isEven(10)); //Should be true
    }
}
