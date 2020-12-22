package main.java.botChat;

public class TrurlBank {

    public int sumQuads(int n) {
        int result = 0;

        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }

    public int sumQuadsRecursion(int n) {
          if (n == 1) {
              return 1;
          }
          int result = (int) Math.pow(n,2) + sumQuads(n-1);
          return result;
    }

    public int countSumOfDigits(int number) {
        int result = 0;
        int i = 0;

        String[] parts = Integer.toString(number).split("");

        while( i < parts.length) {
            result += Integer.parseInt(parts[i]);
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
        System.out.println(bank.sumQuadsRecursion(3));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}


