package Module2.src.main.java.botTasks;

public class ExonNames_41 {

    public boolean areNamesEqual(String name1, String name2) {
        return name1.equals(name2);
    }

    public String makeFullName(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toUpperCase();
    }

    public boolean isNameLucky(String name) {
        String lowerCaseName = name.toLowerCase();
        return lowerCaseName.contains("a") || lowerCaseName.contains("o");
    }

    public String getNameCode(String name) {
        String code = name.charAt(0) + String.valueOf(name.charAt(name.length() - 1));
        return code.toUpperCase();
    }

    public boolean isMoneyName(String name) {
        char s1 = getNameCode(name).charAt(0);
        boolean isDigit1 = s1 >= '0' && s1 <= '9';

        char s2 = getNameCode(name).charAt(1);
        boolean isDigit2 = s2 >= '0' && s2 <= '9';

        return isDigit1 && isDigit2;
    }

    //Test output
    public static void main(String[] args) {
        ExonNames_41 names = new ExonNames_41();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        //Should be BA
        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        //Should be true
        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(\"31Boss31\") = " + isMoneyName);
    }
}

