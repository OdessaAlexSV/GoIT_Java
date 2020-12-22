package main.java.botChat;

public class ATM_1 {

    public int countBanknotes(int sum) {
        int banknotes = 0;
        int restSum = sum;
        int[] nominals = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (i < nominals.length) {
            int count = restSum / nominals[i];//количество банкнот
            banknotes += count; // всего количество банкнот
            restSum = restSum - nominals[i] * count; // оставшая сумма для рапределения
            i++;
        }
        return banknotes;
    }

    public static void main(String[] args) {

        ATM_1 notes = new ATM_1();
        System.out.println(notes.countBanknotes(500));
        System.out.println(notes.countBanknotes(578));
        System.out.println(notes.countBanknotes(105345));
    }
}
