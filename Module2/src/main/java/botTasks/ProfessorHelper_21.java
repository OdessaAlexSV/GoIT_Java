package Module2.src.main.java.botTasks;

class ProfessorHelper_21 {
    public boolean areNumbersCool(int number1, int number2) {
        return number1 == number2;
    }
    //Test output
    public static void main(String[] args) {
        ProfessorHelper_21 helper = new ProfessorHelper_21();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(3, 3)); //Should be true
    }
}
