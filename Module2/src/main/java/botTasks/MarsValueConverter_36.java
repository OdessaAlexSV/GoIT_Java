package Module2.src.main.java.botTasks;

public class MarsValueConverter_36 {

    public int changeMoneyAmount(float startAmount, float toRemove) {
        return (int) (startAmount - toRemove);
    }

    public byte calculateMoneySum(int sum1, int sum2) {
        return (byte) (sum1 + sum2);
    }

    public short halfOfMoney(double startMoney) {
        return (short) (startMoney / 2);
    }

    public static void main(String[] args) {

        MarsValueConverter_36 num = new MarsValueConverter_36();

        System.out.println(num.changeMoneyAmount(100f, 40.5f));
        System.out.println(num.calculateMoneySum(50, 40));
        System.out.println(num.halfOfMoney(1000.9999));
    }
}
