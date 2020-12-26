package main.java.botTasks;

class NumberTester_26 {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }
    //Test output
    public static void main(String[] args) {
        NumberTester_26 tester = new NumberTester_26();
        System.out.println(tester.isEven(10)); //Should be true
        System.out.println(tester.isOdd(10)); //Should be false
    }
}
