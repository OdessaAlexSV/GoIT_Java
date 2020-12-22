package main.java.botChat;

public class ATM_2 {

    public int countBanknotes(int sum) {
        int[] values = {500, 200, 100, 50, 20, 10, 5, 2, 1};

        int result = 0;

        int currentValueIndex = 0;

        while (sum > 0) {
            int currentValue = values[currentValueIndex];
            currentValueIndex++;

            while (sum >= currentValue) {
                result++;
                sum -= currentValue;
            }

        }

        return result;
    }

    public static void main(String[] args) {

        ATM_2 notes = new ATM_2();
        System.out.println(notes.countBanknotes(500));
        System.out.println(notes.countBanknotes(578));
        System.out.println(notes.countBanknotes(105345));
    }

}
