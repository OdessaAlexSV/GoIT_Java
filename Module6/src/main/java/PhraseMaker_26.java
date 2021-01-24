package main.java;

/**
 * Есть метод, которые принимает массив слов, и делает из них строку, разделяя слова пробелами.
 * При этом слова преобразовываются. Если слово длиннее чем 3 символа, то оно приводится в нижний регистр. Иначе оно приводится в верхний регистр.
 *
 * Программа работает правильно, но медленно.
 * Если дать ей на вход массив длиной в десятки тысяч строк, это будет заметно.
 * Это происходит по причине конкатенации строк в цикле.
 *
 * Задача
 * Перепиши существующий код класса PhraseMaker с использованием класса StringBuilder, чтобы избавиться от конкатенации строк в цикле.
 * В остальном программа должна работать точно так же.
 */

/*OLD
class PhraseMaker {
    public String join(String[] words) {
        String result = "";
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }

            result += word;
            if (i != words.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
*/

class PhraseMaker {
    public String join(String[] words) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 3) {
                word = word.toUpperCase();
            } else {
                word = word.toLowerCase();
            }

            result.append(word);

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return String.valueOf(result);
    }
}

class PhraseMakerTest {
    public static void main(String[] args) {
        String[] words = {"Life", "is", "great", "thing"};

        //life IS great thing
        System.out.println(new PhraseMaker().join(words));
    }
}
