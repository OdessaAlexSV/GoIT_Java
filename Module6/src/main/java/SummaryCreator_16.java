package main.java;

/**
 * Текст обрезается по следующему алгоритму:
 * если длина текста 15 или меньше символов - текст оставляется как есть;
 * если длина текста 16 и больше символов - то берутся первые 15 символов.
 * Если следующий символ после первых 15 символов не является пробелом - к результату еще добавляются три точки ... (потому что мы разрезали какое-то слово).
 * Напиши класс SummaryCreator. В этом классе напиши метод public String create(String text).
 * Метод принимает строку, и возвращает ее краткий вариант согласно алгоритма, описанного в теории.
 */

class SummaryCreator {
    public String create(String text) {
        String res;
        if (text.length() <= 15) {
            return text;
        } else {
            res = text.substring(0, 15);
            if (text.charAt(15) != ' ') {
                res += "...";
            }
        }
        return res;
    }
}

class SummaryCreatorTest {
    public static void main(String[] args) {
        SummaryCreator summaryCreator = new SummaryCreator();

        //Mars
        String shortPhrase = "Mars";
        System.out.println(summaryCreator.create(shortPhrase));

        //Java is very po...
        String longPhrase = "Java is very popular language";
        System.out.println(summaryCreator.create(longPhrase));
    }
}