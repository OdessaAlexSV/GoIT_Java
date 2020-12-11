package Module2.src.main.java.botTasks;

public class ExonNames_37 {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public static void main(String[] args) {
        ExonNames_37 names = new ExonNames_37();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);
    }
}
