package main.java.botChat;

public class NumberTranslator {

    public int translate(String romanNumber) {
        int arabNum;
        switch (romanNumber.toUpperCase().trim()) {
            case "I":
                arabNum = 1;
                break;
            case "II":
                arabNum = 2;
                break;
            case "III":
                arabNum = 3;
                break;
            case "IV":
                arabNum = 4;
                break;
            case "V":
                arabNum = 5;
                break;
            case "VI":
                arabNum = 6;
                break;
            case "VII":
                arabNum = 7;
                break;
            case "VIII":
                arabNum = 8;
                break;
            case "IX":
                arabNum = 9;
                break;
            case "X":
                arabNum = 10;
                break;
            case "XI":
                arabNum = 11;
                break;
            case "XII":
                arabNum = 12;
                break;
            default:
                arabNum = -1;
        }
        return arabNum;
    }


    public static void main(String[] args) {
        NumberTranslator watch = new NumberTranslator();

        System.out.println(watch.translate("I"));
        System.out.println(watch.translate("  X  I"));
        System.out.println(watch.translate("iX  "));
        System.out.println(watch.translate("XX"));

    }
}
