package main.java;

/**
 * Перепиши существующий код класса NumberJoiner с использованием класса StringBuilder,
 * чтобы избавиться от конкатенации строк в цикле.
 * В остальном программа должна работать точно так же.
 */

/*OLD
class NumberJoiner {
    public String join(int[] numbers) {
        String result = "";
        for(int number: numbers) {
            result += number;
        }
        return result;
    }
}
*/

class NumberJoiner {
    public String join(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for(int number: numbers) {
            result.append(number);
        }
        return String.valueOf(result);
    }
}

class NumberJoinerTest {
    public static void main(String[] args) {
        //102030
        System.out.println(new NumberJoiner().join(new int[] {10, 20, 30}));
    }
}

